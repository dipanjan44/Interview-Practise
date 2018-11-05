package GraphTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class BFSImpl {

    private Queue<Vertex> vertexQueue;

    public BFSImpl()
    {
        vertexQueue= new LinkedList<>();
    }

    public void bfsTraversal(Vertex root)
    {
        root.setVisited(true);
        vertexQueue.add(root);

        while (!vertexQueue.isEmpty())
        {
            Vertex current= vertexQueue.remove();

            System.out.println(current);

            for(Vertex v: current.getAdjacencyList())
            if(!v.isVisited())
            {
              v.setVisited(true);
              vertexQueue.add(v);
            }
        }

    }
}

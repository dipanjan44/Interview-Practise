package GraphTraversal;

import java.util.Stack;

public class DFSImpl {

    Stack<Vertex> vertexStack;

    public DFSImpl() {
        this.vertexStack = new Stack<>();
    }

    public void dfsTraversal(Vertex root) {
        this.vertexStack.push(root);
        root.setVisited(true);

        while (!vertexStack.isEmpty()) {
            Vertex current = vertexStack.pop();
            System.out.println(current);
            for (Vertex v : current.getAdjacencyList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    vertexStack.push(v);
                }
            }

        }


    }
}

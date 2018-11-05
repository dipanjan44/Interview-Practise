package GraphTraversal;

public class TraversalApp {

    public static void main(String[] args) {

        BFSImpl bfs = new BFSImpl();
        DFSImpl dfs= new DFSImpl();
        Vertex v1 = new Vertex(10);
        Vertex v2 = new Vertex(100);
        Vertex v3 = new Vertex(120);
        Vertex v4 = new Vertex(140);
        Vertex v5 = new Vertex(150);

        v1.addNeighbour(v2);
        v1.addNeighbour(v5);
        v5.addNeighbour(v3);
        v3.addNeighbour(v4);

        System.out.println("Priniting the BFS Traversal");
         bfs.bfsTraversal(v1);
         System.out.println("Priniting the DFS Traversal");
         dfs.dfsTraversal(v5);

    }


}

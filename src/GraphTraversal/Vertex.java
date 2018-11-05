package GraphTraversal;
import java.util.LinkedList;
import java.util.List;

public class Vertex {

    public Vertex(int data) {
        this.data=data;
        this.adjacencyList = new LinkedList<>();
    }

    private int data;
    private List<Vertex> adjacencyList;
    private boolean isVisited;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Vertex> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }


    public void addNeighbour(Vertex vertex)
    {
        this.adjacencyList.add(vertex);
    }

    @Override

    public String toString()
    {
        return String.valueOf(this.data);
    }
}

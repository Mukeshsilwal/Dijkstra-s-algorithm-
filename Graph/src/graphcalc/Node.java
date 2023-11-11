package graphcalc;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String id;
    private List<Edge> neighbours;
    int distance;
    boolean visited;

    public Node() {
    }

    public Node(String id) {
        this.id = id;
        this.neighbours = new ArrayList<>();
        this.distance = Integer.MAX_VALUE;
        this.visited = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Edge> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Edge> neighbours) {
        this.neighbours = neighbours;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}

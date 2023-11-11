package graphcalc;

import java.util.List;

public class Graph {
    List<Node> node;
    List<Edge> edge;

    public Graph() {
    }

    public Graph(List<Node> node, List<Edge> edge) {
        this.node = node;
        this.edge = edge;
    }

    public List<Node> getNode() {
        return node;
    }

    public void setNode(List<Node> node) {
        this.node = node;
    }

    public List<Edge> getEdge() {
        return edge;
    }

    public void setEdge(List<Edge> edge) {
        this.edge = edge;
    }
}

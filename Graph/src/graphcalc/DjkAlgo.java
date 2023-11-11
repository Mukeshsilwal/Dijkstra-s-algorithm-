package graphcalc;

import java.util.ArrayList;
import java.util.List;

public class DjkAlgo {
    public void dijkstra(Graph graph, Node source) {
        source.distance = 0;
        List<Node> unvisitedNodes = new ArrayList<>(graph.getNode());

        while (!unvisitedNodes.isEmpty()) {
            Node current = getClosestNode(unvisitedNodes);

            for (Edge edge : current.getNeighbours()) {
                int tentativeDistance = current.getDistance() + edge.getWeight();
                if (tentativeDistance < edge.destination.getDistance()) {
                    edge.destination.distance = tentativeDistance;
                }
            }

            current.visited = true;
            unvisitedNodes.remove(current);
        }
    }

    private Node getClosestNode(List<Node> nodes) {
        Node closest = null;
        int minDistance = Integer.MAX_VALUE;

        for (Node node : nodes) {
            if (!node.isVisited() && node.getDistance() < minDistance) {
                closest = node;
                minDistance = node.getDistance();
            }
        }

        return closest;
    }

}

import graphcalc.DjkAlgo;
import graphcalc.Edge;
import graphcalc.Graph;
import graphcalc.Node;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DjkAlgo djkAlgo=new DjkAlgo();
        List<Node> nodes=new ArrayList<>();
        List<Edge> edges=new ArrayList<>();
        Graph graph=new Graph(nodes,edges);
        Node  nodeA=new Node("A");
        Node nodeB=new Node("B");
        Node nodeC=new Node("C");
        Node nodeD=new Node("D");
        Node nodeE=new Node("E");
         graph.getNode().add(nodeA);
         graph.getNode().add(nodeB);
         graph.getNode().add(nodeC);
         graph.getNode().add(nodeD);
         graph.getNode().add(nodeE);
        Edge edgeAB=new Edge(nodeA,nodeB,1);
        Edge edgeAC=new Edge(nodeA,nodeC,4);
        Edge edgeBD=new Edge(nodeB,nodeD,3);
        Edge edgeCD=new Edge(nodeC,nodeD,1);
        Edge  edgeCE=new Edge(nodeC,nodeE,2);
        Edge edgeDE=new Edge(nodeD,nodeE,5);
        graph.getEdge().add(edgeAB);
        graph.getEdge().add(edgeAC);
        graph.getEdge().add(edgeBD);
        graph.getEdge().add(edgeCD);
        graph.getEdge().add(edgeCE);
        graph.getEdge().add(edgeDE);
        nodeA.getNeighbours().add(edgeAB);
        nodeA.getNeighbours().add(edgeAC);
        nodeB.getNeighbours().add(edgeBD);
        nodeC.getNeighbours().add(edgeCD);
        nodeC.getNeighbours().add(edgeCE);
        nodeD.getNeighbours().add(edgeDE);
        djkAlgo.dijkstra(graph,nodeA);
        System.out.println("Shortest distances from node A:");
        for (Node node : nodes) {
            System.out.println("To " + node.getId() + ": " + node.getDistance());
        }


    }
}
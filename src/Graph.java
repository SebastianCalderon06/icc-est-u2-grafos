import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Node> nodes;

    public Graph() {
        nodes = new HashSet<>();
    }

    public Node addNode(int value){
        Node node = new Node(value);
        nodes.add(node);
        return node;
    } 

    public void addEdge(Node src, Node dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void addEdgeUni(Node src, Node des){
        src.addNeighbor(des);
    }

    public void printGraph() {
    for (Node node : nodes) {
        System.out.print(" Vertex " + node.getValue() + ": ");
        for (Node neighbor : node.getNeighbors()) {
            System.out.print(" -> " + neighbor.getValue());
        }
        System.out.println();
    }
}
    
    
}

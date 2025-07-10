public class App {
    public static void main(String[] args) throws Exception {
       Graph g = new Graph();
       Node node1 = g.addNode(0);
       Node node2 = g.addNode(5);
       Node node3 = g.addNode(3);
       Node node4 = g.addNode(9);
       Node node5 = g.addNode(4);
       Node node6 = g.addNode(2);
       Node node7 = g.addNode(1);
       Node node8 = g.addNode(7);
       Node node9 = g.addNode(8);
       g.addEdge(node1, node7);
       g.addEdge(node1, node3);
       g.addEdge(node1, node2);
       g.addEdge(node6, node3);
       g.addEdge(node5, node3);
       g.addEdge(node8, node3);
       g.addEdge(node3, node4);
       g.addEdge(node5, node7);
       g.addEdge(node9, node7);
       g.addEdge(node6, node7);
       g.addEdge(node8, node9);
       g.printGraph();

    }
}

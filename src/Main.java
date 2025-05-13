public class Main {
    public static void main(String[] args) {
        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        Vertex<String> c = new Vertex<>("C");
        Vertex<String> d = new Vertex<>("D");

        WeightedGraph<String> graph = new WeightedGraph<>();
        graph.addEdge(a, b, 1);
        graph.addEdge(b, c, 2);
        graph.addEdge(a, c, 4);
        graph.addEdge(c, d, 1);

        Search<String> bfs = new BreadthFirstSearch<>(graph, a);
        System.out.println("BFS path to D: " + bfs.pathTo(d));

        Search<String> dijkstra = new DijkstraSearch<>(graph, a);
        System.out.println("Dijkstra path to D: " + dijkstra.pathTo(d));
    }
}

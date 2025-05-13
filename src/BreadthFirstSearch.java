import java.util.*;

public class BreadthFirstSearch<V> implements Search<V> {
    private Set<Vertex<V>> visited = new HashSet<>();
    private Map<Vertex<V>, Vertex<V>> edgeTo = new HashMap<>();
    private Vertex<V> start;

    public BreadthFirstSearch(WeightedGraph<V> graph, Vertex<V> start) {
        this.start = start;
        bfs(start);
    }

    private void bfs(Vertex<V> source) {
        Queue<Vertex<V>> queue = new LinkedList<>();
        visited.add(source);
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();
            for (Vertex<V> neighbor : current.getAdjacentVertices().keySet()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    edgeTo.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }
    }

    @Override
    public boolean hasPathTo(Vertex<V> v) {
        return visited.contains(v);
    }

    @Override
    public Iterable<Vertex<V>> pathTo(Vertex<V> v) {
        if (!hasPathTo(v)) return null;
        LinkedList<Vertex<V>> path = new LinkedList<>();
        for (Vertex<V> x = v; x != start; x = edgeTo.get(x)) {
            path.addFirst(x);
        }
        path.addFirst(start);
        return path;
    }
}

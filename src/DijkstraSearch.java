import java.util.*;

public class DijkstraSearch<V> implements Search<V> {
    private Map<Vertex<V>, Double> distTo = new HashMap<>();
    private Map<Vertex<V>, Vertex<V>> edgeTo = new HashMap<>();
    private PriorityQueue<Vertex<V>> pq;

    public DijkstraSearch(WeightedGraph<V> graph, Vertex<V> start) {
        for (Vertex<V> v : graph.getVertices()) {
            distTo.put(v, Double.POSITIVE_INFINITY);
        }
        distTo.put(start, 0.0);

        pq = new PriorityQueue<>(Comparator.comparingDouble(distTo::get));
        pq.add(start);

        while (!pq.isEmpty()) {
            Vertex<V> current = pq.poll();
            for (Map.Entry<Vertex<V>, Double> entry : current.getAdjacentVertices().entrySet()) {
                relax(current, entry.getKey(), entry.getValue());
            }
        }
    }

    private void relax(Vertex<V> u, Vertex<V> v, double weight) {
        double newDist = distTo.get(u) + weight;
        if (newDist < distTo.get(v)) {
            distTo.put(v, newDist);
            edgeTo.put(v, u);
            pq.remove(v);
            pq.add(v);
        }
    }

    @Override
    public boolean hasPathTo(Vertex<V> v) {
        return distTo.containsKey(v) && distTo.get(v) < Double.POSITIVE_INFINITY;
    }

    @Override
    public Iterable<Vertex<V>> pathTo(Vertex<V> v) {
        if (!hasPathTo(v)) return null;
        LinkedList<Vertex<V>> path = new LinkedList<>();
        for (Vertex<V> x = v; edgeTo.containsKey(x); x = edgeTo.get(x)) {
            path.addFirst(x);
        }
        path.addFirst(edgeTo.getOrDefault(v, v));
        return path;
    }
}

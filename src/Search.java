public interface Search<V> {
    boolean hasPathTo(Vertex<V> v);
    Iterable<Vertex<V>> pathTo(Vertex<V> v);
}

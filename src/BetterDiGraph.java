import java.util.NoSuchElementException;

public class BetterDiGraph implements EditableDiGraph {
    /**
     * Adds an edge between two vertices, v and w. If vertices do not exist,
     * adds them first.
     *
     * @param v source vertex
     * @param w destination vertex
     */
    @Override
    public void addEdge(int v, int w) {

    }

    /**
     * Adds a vertex to the graph. Does not allow duplicate vertices.
     *
     * @param v vertex number
     */
    @Override
    public void addVertex(int v) {

    }

    /**
     * Returns the direct successors of a vertex v.
     *
     * @param v vertex
     * @return successors of v
     */
    @Override
    public Iterable<Integer> getAdj(int v) {
        return null;
    }

    /**
     * Number of edges.
     *
     * @return edge count
     */
    @Override
    public int getEdgeCount() {
        return 0;
    }

    /**
     * Returns the in-degree of a vertex.
     *
     * @param v vertex
     * @return in-degree.
     * @throws NoSuchElementException exception thrown if vertex does not exist.
     */
    @Override
    public int getIndegree(int v) throws NoSuchElementException {
        return 0;
    }

    /**
     * Returns number of vertices.
     *
     * @return vertex count
     */
    @Override
    public int getVertexCount() {
        return 0;
    }

    /**
     * Removes edge from graph. If vertices do not exist, does not remove edge.
     *
     * @param v source vertex
     * @param w destination vertex
     */
    @Override
    public void removeEdge(int v, int w) {

    }

    /**
     * Removes vertex from graph. If vertex does not exist, does not try to
     * remove it.
     *
     * @param v vertex
     */
    @Override
    public void removeVertex(int v) {

    }

    /**
     * Returns iterable object containing all vertices in graph.
     *
     * @return iterable object of vertices
     */
    @Override
    public Iterable<Integer> vertices() {
        return null;
    }
}

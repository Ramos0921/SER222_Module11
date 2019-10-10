public class IntuitiveToplogical implements TopologicalSort {
    private Iterable<Integer> order;

    public IntuitiveToplogical() {

    }

    /**
     * Returns an iterable object containing a topological sort.
     *
     * @return a topological sort.
     */
    @Override
    public Iterable<Integer> order() {
        return order;
    }

    /**
     * Returns true if the graph being sorted is a DAG, false otherwise.
     *
     * @return is graph a DAG
     */
    @Override
    public boolean isDAG() {
        return false;
    }
}

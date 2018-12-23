public class PriorityQueue<T extends Comparable<T>> {

    private BinaryHeap<MyPair<Integer, T>> h;

    public PriorityQueue() {
        h = new BinaryHeap<>();
    }

    public void add(T t, int priority)
    {
        MyPair<Integer, T> pair = new MyPair(priority, t);
        h.add(pair);
    }

    public T get() {
        return h.remove().getValue();
    }

    public BinaryHeap<MyPair<Integer, T>> getH() {
        return h;
    }
}
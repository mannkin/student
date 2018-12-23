public class MyPair<K extends Comparable<K>, V extends Comparable<V>> implements Comparable<MyPair<K, V>> {

    public final K key;
    public final V value;

    public MyPair(K first, V second) {
        this.key = first;
        this.value = second;
    }

    public static <K extends Comparable<K>, V extends Comparable<V>>
    MyPair<K, V> of(K first, V second) {
        return new MyPair<>(first, second);
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public int compareTo(MyPair<K, V> o) {
        int cmp = compare(key, o.key);
        return cmp == 0 ? compare(value, o.value) : cmp;
    }


    private <T extends Comparable<T>> int compare(T o1, T o2) {
        if(o1 == null) {
            if(o2 == null) {
                return 0;
            } else {
                return -1;
            }
        } else if(o2 == null) {
            return +1;
        } else {
            return o1.compareTo(o2);
        }
    }

    @Override
    public int hashCode() {
        return 31 * hashcode(key) + hashcode(value);
    }

    private static int hashcode(Object o) {
        return o == null ? 0 : o.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyPair)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return equal(key, ((MyPair) obj).key)
                && equal(value, ((MyPair) obj).value);
    }

    private boolean equal(Object o1, Object o2) {
        return o1 == null ? o2 == null : (o1 == o2 || o1.equals(o2));
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ')';
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
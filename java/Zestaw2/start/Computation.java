@FunctionalInterface
public interface Computation<T> {
    T compute(T arg);
}
public interface Calc<T> {
    T add(T a);
    T sub(T a);
    T mul(T a);
    T div(T a);
    String toString();

    default String defaultMethod() {
        return "Operacja na ulamkach";
    }

    default void print1() {
        System.out.println("Calc");
    }

    default void print2() {
        print1();
    }
}




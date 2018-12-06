package sample.complex;

public interface Field<T> {
	T add(T arg);
	T sub(T arg);
	T mul(T arg);
	T div(T arg);
	String toString();
}

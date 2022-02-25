package interfaces;

public interface Operations<T, E> {
	T product(int index, int index2);
	T maxValue(E collection);
	T minValue(E collection);
	T sum(int index, int index2);
}

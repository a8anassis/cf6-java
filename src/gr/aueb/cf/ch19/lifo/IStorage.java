package gr.aueb.cf.ch19.lifo;

public interface IStorage<T> {
    void push(T t);

    int getSize();

    T pop();

    boolean isEmpty();

    T[] toArray(T[] a);

    void printItems();
}

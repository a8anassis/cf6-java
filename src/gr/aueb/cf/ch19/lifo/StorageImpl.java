package gr.aueb.cf.ch19.lifo;

import java.util.ArrayDeque;
import java.util.Deque;

public class StorageImpl<T> implements IStorage<T> {
    private final Deque<T> myStack;

    public StorageImpl(int size) {
        myStack = new ArrayDeque<>(size);
    }

    @Override
    public void push(T t) {
        myStack.push(t);
    }

    @Override
    public T pop() {
        return myStack.pop();
    }

    @Override
    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    @Override
    public T[] toArray(T[] a) {
        return myStack.toArray(a);
    }

    @Override
    public void printItems() {
        myStack.forEach(System.out::println);
    }
}

package gr.aueb.cf.ch19;

/**
 * Defines a Generic {@link Node} using
 * a generic type <T>.
 *
 * @param <T>   a reference type.
 */
public class GenericNode<T> {
    private T item;

    public GenericNode() {
    }

    public GenericNode(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "GenericNode{" +
                "item=" + item +
                '}';
    }
}

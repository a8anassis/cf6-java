package gr.aueb.cf.ch19;

/**
 * A generic {@link Node} with an
 * {@link Object} data type inside.
 */
public class FlexibleNode {
    private Object item;

    public FlexibleNode() {
    }

    public FlexibleNode(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}

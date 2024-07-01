package gr.aueb.cf.ch19;

/**
 * Ορίζει μία κλάση {@link Node} με
 * ένα μόνο πεδίο int.
 */
public class Node {
    private int item;

    public Node() {
    }

    public Node(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
}

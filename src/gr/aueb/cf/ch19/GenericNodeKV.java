package gr.aueb.cf.ch19;

/**
 * Defines a key-value node with two
 * types <K>and <V>.
 * @param <K>
 * @param <V>
 */
public class GenericNodeKV <K, V> {
    private K key;
    private V value;

    public GenericNodeKV() {
    }

    public GenericNodeKV(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericNodeKV{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

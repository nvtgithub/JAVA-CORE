package session11.generic;

public class Demo02<K,V> {
    private K key;
    private V value;

    public Demo02() {
    }

    public Demo02(K key, V value) {
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
        return "Demo02{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

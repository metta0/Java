package generic.test.ex2;

public class Pair<T1, T2> {
    T1 key;
    T2 value;

    public T1 getFirst() {
        return key;
    }

    public void setFirst(T1 key) {
        this.key = key;
    }

    public T2 getSecond() {
        return value;
    }

    public void setSecond(T2 value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

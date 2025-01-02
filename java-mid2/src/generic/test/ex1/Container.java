package generic.test.ex1;

public class Container<T> {

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public boolean isEmpty(){
        return item == null;
    }
}

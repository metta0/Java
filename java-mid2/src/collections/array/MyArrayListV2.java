package collections.array;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int length) {
        this.elementData = new Object[length];
    }

    public int size() {
        return size;
    }

    public void add(Object o) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = o;
        size++;

    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object o) {
        Object oldValue = elementData[index];
        elementData[index] = o;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + ", capacity=" + elementData.length;
    }

}



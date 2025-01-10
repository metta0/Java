package collections.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV3() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int length) {
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

    public void add(int index, Object o) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);

        elementData[index] = o;
        size++;
    }

    private void shiftRightFrom(int index) {
        for(int i=size; i > index; i--){
            elementData[i] = elementData[i-1];
        }
    }

    public Object remove(int index) {
        Object oldValue = elementData[index];
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i=index; i< size-1; i++){
            elementData[i] = elementData[i+1];
        }
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
    private void move() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + ", capacity=" + elementData.length;
    }

}



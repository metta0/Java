package collections.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int length) {
        this.elementData = new Object[length];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E o) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = o;
        size++;

    }

    @Override
    public void add(int index, E o) {
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

    @Override
    public E remove(int index) {
        E oldValue = get(index);
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


    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E o) {
        E oldValue = get(index);
        elementData[index] = o;
        return oldValue;
    }

    @Override
    public int indexOf(E o) {
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



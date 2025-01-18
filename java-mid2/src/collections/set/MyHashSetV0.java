package collections.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    public boolean add(int i) {
        if(contains(i)){
            return false;
        }
        elementData[size] = i;
        size++;
        return true;
    }

    public boolean contains(int i) {
        for (int element : elementData) {
            if (element == i) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }
}

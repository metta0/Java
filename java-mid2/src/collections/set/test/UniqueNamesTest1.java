package collections.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        HashSet<Integer> integers = new HashSet<>();
        integers.addAll(List.of(inputArr));
        for (Integer integer : integers) {
            System.out.println(integer);

        }
    }
}

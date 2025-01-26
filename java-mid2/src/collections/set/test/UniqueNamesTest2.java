package collections.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        HashSet<Integer> set = new LinkedHashSet<>();
        set.addAll(List.of(inputArr));
        for (Integer integer : set) {
            System.out.println(integer);

        }
    }
}

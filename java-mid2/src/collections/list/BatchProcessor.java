package collections.list;

public class BatchProcessor {


    private final MyList<Integer> myList = new MyLinkedList<>();

    public void logic(int size) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            myList.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime -
                startTime) + "ms");

    }

    public static void main(String[] args) {
        new BatchProcessor().logic(1_000_000);
    }

}

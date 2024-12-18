package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
//        localVar = 10;
//        paramVar = 20;

        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV1 = new LocalOuterV4();
        Printer printer = localOuterV1.process(2);
        printer.print();

        //추가
        System.out.println("필드확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}

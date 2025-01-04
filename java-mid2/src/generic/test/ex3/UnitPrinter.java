package generic.test.ex3;

public class UnitPrinter {

    static <T extends BioUnit> void printV1(Shuttle<T> t) {
        T unit = t.out();
        System.out.println("제너릭메소드: " + unit);
    }

    static void printV2(Shuttle<? extends BioUnit> t) {
        BioUnit unit = t.out();
        System.out.println("와일드카드: " + unit);
    }
}

package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested inner = new NestedOuter.Nested();
        inner.print();
    }
}

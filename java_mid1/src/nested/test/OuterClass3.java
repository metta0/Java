package nested.test;

public class OuterClass3 {
    public void myMethod() {
        // 지역 클래스
        class LocalClass {
            void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        new LocalClass().hello();
    }
}


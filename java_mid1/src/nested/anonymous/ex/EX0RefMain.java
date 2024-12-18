package nested.anonymous.ex;

public class EX0RefMain {

    public static void hello(String words){
        System.out.println("프로그램 시작");
        System.out.println("Hello "+words);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}

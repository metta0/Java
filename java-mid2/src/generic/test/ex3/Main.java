package generic.test.ex3;

public class Main {

    public static void main(String[] args) {

        Marine marine1 = new Marine("Marine1", 100);
        Marine marine2 = new Marine("Marine2", 200);
        Marine unit1 = UnitUtil.maxHP(marine1, marine2);
        System.out.println("unit1 = " + unit1);

        Zealot zealot1 = new Zealot("Zealot1", 100);
        Zealot zealot2 = new Zealot("Zealot2", 200);
        Zealot unit2 = UnitUtil.maxHP(zealot1, zealot2);
        System.out.println("unit2 = " + unit2);


    }
}

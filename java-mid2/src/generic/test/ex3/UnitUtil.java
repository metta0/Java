package generic.test.ex3;

public class UnitUtil {
    static <T extends BioUnit> T maxHP(T unit1, T unit2){
        return unit1.getHp() > unit2.getHp() ? unit1 : unit2;
    }
}

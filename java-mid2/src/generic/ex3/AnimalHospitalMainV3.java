package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV4<Dog> dogHospital = new AnimalHospitalV4<>();
        AnimalHospitalV4<Cat> catHospital = new AnimalHospitalV4<>();

        Dog dog = new Dog("멍멍이1" , 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        //문제해결 1: 개 병원에 고양이 전달
        //dogHospital.set(cat);

        //문제해결 2: 개 타입 반환
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

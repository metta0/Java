package time.test;

import java.time.LocalDateTime;

public class test {

    public static void main(String[] args) {
        /*
        1번 문제
         */
        LocalDateTime ldt = LocalDateTime.of(2024,1,1,0,0, 0);
        LocalDateTime futureDateTime = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("기준시각 = " + ldt);
        System.out.println("1년 2개월 3일 4시간 후의 시각 = " + futureDateTime);


    }
}

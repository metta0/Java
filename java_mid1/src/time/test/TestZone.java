package time.test;

import java.time.*;

public class TestZone {

    public static void main(String[] args) {
        ZonedDateTime seoulDateTime = ZonedDateTime.of(LocalDateTime.of(2024, 1, 1, 9, 0, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonDateTime = seoulDateTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime newyorkDateTime = seoulDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("seoul = " + seoulDateTime);
        System.out.println("londonDateTime = " + londonDateTime);
        System.out.println("newyorkDateTime = " + newyorkDateTime);
    }
    
}

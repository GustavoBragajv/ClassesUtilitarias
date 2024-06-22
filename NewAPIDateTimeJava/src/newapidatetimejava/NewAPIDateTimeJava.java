package newapidatetimejava;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class NewAPIDateTimeJava {


    public static void main(String[] args) {
        LocalDate localDateNow = LocalDate.now();
        System.out.println("Date now: " + localDateNow);
        LocalDate localDateOf = LocalDate.of(1986, Month.MARCH, 15);
        System.out.println("Date of: " + localDateOf);
        
        LocalTime localTimeNow = LocalTime.now();
        System.out.println("Time now: " + localTimeNow);
        LocalTime localTimeOf = LocalTime.of(15, 25, 55);
        System.out.println("Time of: " + localTimeOf);
        
        
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("Date Time now: " + localDateTimeNow);
        LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOf, localTimeOf);
        System.out.println("Date Time of: " + localDateTimeOf);
        
        
        Instant instantNow = Instant.now();
        System.out.println("Instant now: " + instantNow);
        Instant instantOf = Instant.ofEpochMilli(987654321123L);
        System.out.println("Instant of: " + instantOf);
        
        
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println("Zoned Date Time now: " + zonedDateTimeNow);
        ZoneId zoneId = ZoneId.of("America/Argentina/Buenos_Aires");
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(localDateOf, localTimeOf, zoneId);
        System.out.println("Zoned Date Time of: " + zonedDateTimeOf);
        
        // Os métodos mais usados são plus para somar um dia, mes ano e minus para subtrair dias, meses e anos.
        

    }

}

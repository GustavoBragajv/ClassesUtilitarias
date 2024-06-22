package findingpastdatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class FindingPastDateTime {


    public static void main(String[] args) {
        LocalDateTime pastDateTime = LocalDateTime.of(1997, 10, 25, 18, 30);
        
        ZoneId berlinZone = ZoneId.of("Europe/Berlin");
        
        ZoneId denverColZone = ZoneId.of("GMT-6");
        
        ZonedDateTime pastDateTimeInBerlin = ZonedDateTime.of(pastDateTime, berlinZone);
        
        ZonedDateTime pastTimeInDenver = pastDateTimeInBerlin.withZoneSameInstant(denverColZone);
        
        System.out.println(pastDateTimeInBerlin);
        System.out.println(pastTimeInDenver);
    }

}

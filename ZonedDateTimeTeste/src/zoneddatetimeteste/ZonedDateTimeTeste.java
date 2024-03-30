package zoneddatetimeteste;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;


public class ZonedDateTimeTeste {

    public static void main(String[] args) {
        Map<String, String> shortids = ZoneId.SHORT_IDS;
        System.out.println(shortids);
        System.out.println(ZoneId.systemDefault()); // pegando a zona do sistema
        
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        
        ZonedDateTime zonedDateTime = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime);
        
        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);
        
        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime);
    }
    
}

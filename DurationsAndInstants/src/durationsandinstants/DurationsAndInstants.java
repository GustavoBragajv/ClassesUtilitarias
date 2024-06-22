package durationsandinstants;

import java.time.Duration;
import java.time.Instant;


public class DurationsAndInstants {


    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println("Timestap: " + timestamp);
        
        int nanoSecondFromLastSecond = timestamp.getNano();
        System.out.println(nanoSecondFromLastSecond);
        
        Duration threeHours = Duration.ofHours(3);
        
        long seconds = threeHours.minusMinutes(15).getSeconds();
        
        long minutes = Duration.ofSeconds(seconds).toMinutes();
        
        System.out.println("3 Hours - 15 Minutes: " + seconds + " seconds");
        System.out.println("3 Hours - 15 Minutes: " + minutes + " Minutes");
    }

}

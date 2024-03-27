package temporaladjustersteste;


import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;


public class TemporalAdjustersTeste {

    public static void main(String[] args) {
        // Classe usada para fazer ajustes no tempo
        LocalDate now = LocalDate.now();
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now.getDayOfWeek());
        
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now.getDayOfWeek());
        
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }

}

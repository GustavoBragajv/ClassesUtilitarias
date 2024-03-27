package temporaladjustertesteexercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;


public class TemporalAdjusterTesteExercicio {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
        
        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        
    }
    
    
    public static class ObterProximoDiaUtil implements TemporalAdjuster{
        
        @Override
        public Temporal adjustInto(Temporal temporal) {
            DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int addDays;
            switch (dayOfWeek) {
                case WEDNESDAY:
                    addDays = 6;
                    break;
                case THURSDAY:
                    addDays = 5;
                    break;
                case FRIDAY:
                    addDays = 4;
                    break;
                case SUNDAY:
                    addDays = 3;
                    break;
                case SATURDAY:
                    addDays = 2;
                    break;
                default:
                    addDays = 1;
                    break;
            }
            return temporal.plus(addDays, ChronoUnit.DAYS);
        }
    }

}

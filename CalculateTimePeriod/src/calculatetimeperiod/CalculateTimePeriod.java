package calculatetimeperiod;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


public class CalculateTimePeriod {


    public static void main(String[] args) {
        // Verificando quanto tempo falta para no natal
        LocalDate today = LocalDate.now();
        
        LocalDate chirstmasDayofThisYear = LocalDate.of(today.getYear(), Month.DECEMBER, 25);
        
        Period howLongForChirstmas = Period.between(today, chirstmasDayofThisYear);
        
        int years = howLongForChirstmas.getYears();
        int months = howLongForChirstmas.getMonths();
        int days = howLongForChirstmas.getDays();
        
        System.out.println("Days: " + days);
        System.out.println("Months: " + months);
        System.out.println("Years: " + years);
    }

}

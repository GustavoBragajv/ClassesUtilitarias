package datashorasminutos;

import java.time.*;

public class DatasHorasMinutos {


    public static void main(String[] args) {
        
        // Imprimindo somente a data de hoje
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        
        System.out.println("");
        
        // Imprimindo somente o horário de hoje
        LocalTime thisTime = LocalTime.now();
        System.out.println("ThisTime: " + thisTime);
        
        System.out.println("");
        
        // Imprimindo tanto a data quanto a hora
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("CurrenteDateTime: " + currentDateTime);
        
        System.out.println("");
        
        // Imprimindo uma data especifica
        LocalDate someDate = LocalDate.of(1997, Month.OCTOBER, 25);
        System.out.println("SomeDate: " + someDate);
        
        System.out.println("");
        
        // Imprimindo um horário especifico
        LocalTime someTime = LocalTime.of(12, 45);
        System.out.println("SomeTime: " + someTime);
        
        System.out.println("");
        
        // Imprimindo tanto uma data quanto um horário especifico
        LocalDateTime otherDateTime = LocalDateTime.of(1997, Month.OCTOBER, 25, 9, 45, 12);
        System.out.println("OtherDateTime: " + otherDateTime);
    }

}

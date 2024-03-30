package datetimeformatterteste;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeFormatterTeste {


    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        
        String date1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String date2 = date.format(DateTimeFormatter.ISO_DATE);
        String date3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        
        LocalDateTime now = LocalDateTime.now();
        String date4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date4);
        
        LocalDateTime parse4 = LocalDateTime.parse("2024-03-30T03:14:11.42358229", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
    }

}

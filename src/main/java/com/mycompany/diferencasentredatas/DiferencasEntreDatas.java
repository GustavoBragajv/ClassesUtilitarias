package com.mycompany.diferencasentredatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class DiferencasEntreDatas {

    public static void main(String[] args) {
        System.out.println("Calculando diferenças entre datas (Date, Calendar)");
        
        try{
            diferencaDataAteJava7();
        } catch(ParseException e) {
            e.printStackTrace();
        }
        
        System.out.println("================");
        System.out.println("");
        
        diferencaDataJava8();
        System.out.println("================");
        System.out.println("");
        
        diferencaDataJava8ComTempo();
        System.out.println("================");
        System.out.println("");
        
        diferencaDataJava8ComChronoUnit();
    }
    
    public static void diferencaDataAteJava7() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date primeiraData = sdf.parse("25/10/1997");
        Date segundaData = sdf.parse("25/11/1997");
        
        long diffEmMil = Math.abs(segundaData.getTime() - primeiraData.getTime());
        
        long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);
        
        // também podemos calcular essa diferença de outra maneria
        
        int dias = (int) (diffEmMil / (1000 * 60 * 60 * 24));
        
        System.out.println(diff);
        System.out.println(dias);
    }
    
    
    public static void diferencaDataJava8() {
        LocalDate data1 = LocalDate.of(1997, 10, 25);
        LocalDate data2 = LocalDate.of(1997, 11, 25);
        
        Period periodo = Period.between(data1, data2);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();
        int anos = periodo.getYears();
        
        System.out.println("Dias: " + dias);
        System.out.println("Meses: " + meses);
        System.out.println("Anos: " + anos);
    }
    
    public static void diferencaDataJava8ComTempo() {
        LocalDateTime data1 = LocalDateTime.of(1997, 10, 25, 5, 45);
        LocalDateTime data2 = LocalDateTime.of(1997, 11, 25, 3, 45);
        
        Duration duracao = Duration.between(data1, data2);
        long diff = duracao.toHours();
        
        System.out.println(diff);
    }
    
    
    public static void diferencaDataJava8ComChronoUnit() {
        LocalDateTime data1 = LocalDateTime.of(1997, 10, 25, 5, 45);
        LocalDateTime data2 = LocalDateTime.of(1997, 11, 25, 3, 45);
        
        long diff = ChronoUnit.HOURS.between(data1, data2);
        
        System.out.println(diff);
    }
}

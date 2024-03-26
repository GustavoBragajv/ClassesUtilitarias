package datasteste;

import java.util.Calendar;
import java.util.Date;

public class DatasTeste {

    public static void main(String[] args) {
        System.out.println("Classe Date");
        // Date representa as datas em milesegundos
        Date data = new Date(); // Classe depreciada (NÃO USAR)
        
        System.out.println("=============================");
        System.out.println("Classe Calendar");
        Calendar calendario = Calendar.getInstance();
        data = calendario.getTime();
        System.out.println(data);
        if(calendario.getFirstDayOfWeek() == Calendar.MONDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK)); // mes
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH)); // dia
        System.out.println(calendario.get(Calendar.DAY_OF_YEAR)); // Quantidade de dias do ano
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // Quantas semanas no mes
    }

}

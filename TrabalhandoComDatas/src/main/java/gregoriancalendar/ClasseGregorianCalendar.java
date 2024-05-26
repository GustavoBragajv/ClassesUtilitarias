package gregoriancalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClasseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar hoje = new GregorianCalendar();
        GregorianCalendar bissexto = new GregorianCalendar();
        Calendar hoje1 = Calendar.getInstance();

        System.out.println(hoje1.get(Calendar.DAY_OF_MONTH)); // pegando o dia do mês

        System.out.println();

        System.out.println(hoje.get(GregorianCalendar.DAY_OF_MONTH)); // também pegando o dia do mẽs
        imprimirDataFormatada(hoje);

        // Também podemos usar a classe GregorianCalendar para saber se um ano é bissexto.
        System.out.println(bissexto.isLeapYear(2024));

    }

    private static void imprimirDataFormatada(GregorianCalendar hoje) {

        int dia = hoje.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = hoje.get(GregorianCalendar.MONTH) + 1;
        int ano = hoje.get(GregorianCalendar.YEAR);
        int hora = hoje.get(GregorianCalendar.HOUR);
        int minutos = hoje.get(GregorianCalendar.MINUTE);
        int segundos = hoje.get(GregorianCalendar.SECOND);
        System.out.printf("Hoje é: %02d/%02d/%02d%n", dia, mes, ano);
        System.out.printf("Horário: %02d:%02d:%02d%n", hora, minutos, segundos);
    }
}

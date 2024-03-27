package chronounitteste;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;



public class ChronoUnitTeste {

    public static void main(String[] args) {
        LocalDate anoNascimento = LocalDate.of(1997, Month.OCTOBER, 25);
        LocalDate agora = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(anoNascimento, agora)); // Pegando a quantidade de dias passados desde a data do meu nascimento até o ano atual
        System.out.println(ChronoUnit.WEEKS.between(anoNascimento, agora));// Pegando a quantidade de semanas passados desde a data do meu nascimento até o ano atual
        System.out.println(ChronoUnit.MONTHS.between(anoNascimento, agora));// Pegando a quantidade de meses passados desde a data do meu nascimento até o ano atual
        System.out.println(ChronoUnit.YEARS.between(anoNascimento, agora));// Pegando a quantidade de anos passados desde a data do meu nascimento até o ano atual
    }

}

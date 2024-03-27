package periodteste;

import static java.time.Instant.now;
import java.time.LocalDate;
import java.time.Period;


public class PeriodTeste {

    public static void main(String[] args) {
        // Classe usada para trabalhar com periodos de datas
        LocalDate agora = LocalDate.now();
        LocalDate agoraDepoisDeDoisAnos = LocalDate.now().plusYears(2);
        Period p1 = Period.between(agora, agoraDepoisDeDoisAnos);
        Period p2 = Period.ofDays(25);
        Period p3 = Period.ofMonths(6);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}

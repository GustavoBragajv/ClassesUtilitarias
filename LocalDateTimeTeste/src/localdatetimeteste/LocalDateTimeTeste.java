package localdatetimeteste;

import java.time.LocalDateTime;


public class LocalDateTimeTeste {

    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora); // pegando a data por completo
        System.out.println(dataHora.getHour()); // somente a hora
        System.out.println(dataHora.getMinute()); // somente os minutos
        System.out.println(dataHora.getSecond()); // somente os segundos
        System.out.println(dataHora.getMonth()); // somente o mês
        System.out.println(dataHora.getDayOfWeek()); // dia da semana
        System.out.println(dataHora.getDayOfMonth()); // somente o dia
        System.out.println(dataHora.getYear()); // somente o ano
    }

}

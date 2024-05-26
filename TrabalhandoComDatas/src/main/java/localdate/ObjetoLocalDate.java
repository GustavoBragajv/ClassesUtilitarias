package localdate;


import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class ObjetoLocalDate {
    public static void main(String[] args) {
        // Data: dd/MM/yyyy = formato iso
        LocalDate dataAgora = LocalDate.now();
        System.out.println(dataAgora);
        System.out.println(LocalDate.of(1997,10,25));
        String data = "1973-04-23"; // Não apresentaria um erro pois a data está no padrão correto.
        //String data = "1973/04/23"; // Apresentaria um erro pois o formato da data é inválido
        try {
            LocalDate dataConvertida = LocalDate.parse(data);
            System.out.println(dataConvertida);
        } catch (DateTimeException dateTimeException) {
            System.out.println("Error data inválida!");
        }
        System.out.println();

        // Também podemos adicionar dias, mes, semanas e anos com o LocalDate usando o método (plus)
        System.out.println(dataAgora.plusDays(5)); // adicionando dias
        System.out.println(dataAgora.plusMonths(3)); // adicionando meses
        System.out.println(dataAgora.plusWeeks(2)); // adicionando semanas
        System.out.println(dataAgora.plusYears(10)); // adicionando anos
        System.out.println();

        // Também podemos remover dias, mes, semanas e anos com o LocalDate usando o método (minus)
        System.out.println(dataAgora.minusDays(5)); // Removendo dias
        System.out.println(dataAgora.minusMonths(3)); // Removendo meses
        System.out.println(dataAgora.minusWeeks(2)); // Removendo semanas
        System.out.println(dataAgora.minusYears(10)); // Removendo anos
        System.out.println();

        // Também podemos usar o objeto LocalDate para saber se o ano é bissexto
        System.out.println(dataAgora.isLeapYear());
        System.out.println();

        // Também conseguimos trabalhar com as horas usando o método LocalTime
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);

        // e todos os outros métodos usados em data também podem ser aplicados em horários.
        System.out.println();

        // Também podemos pegar a data completa do sistema (data e horário)
        // E também todos os métodos visto em data serve para data completa.
        LocalDateTime dataCompleta = LocalDateTime.now();
        System.out.println(dataCompleta);
        System.out.println();

        // Também podemos trabalhar com fusos horários usando o objeto ZoneId.
        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);
        System.out.println();

        // Também podemos obter todos os fusos horários que existe
        Set<String> fusos = ZoneId.getAvailableZoneIds();
        for(String f : fusos) {
            System.out.println(f);
        }
        System.out.println();

        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        LocalDateTime localDateTimeDte = LocalDateTime.ofInstant(date.toInstant(), sp);
        System.out.println(localDateTimeDte);
        System.out.println(LocalDateTime.ofInstant(c.toInstant(), sp));
    }
}
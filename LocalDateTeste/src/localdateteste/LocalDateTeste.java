package localdateteste;

import java.time.LocalDate;
import java.time.Month;


public class LocalDateTeste {

    public static void main(String[] args) {
        // A classe LocalDate é imutavel ou seja não a alteração.
        LocalDate dataModificada = LocalDate.of(1997, Month.OCTOBER, 25);
        System.out.println(dataModificada.getYear()); // ano
        System.out.println(dataModificada.getMonthValue()); // mes
        System.out.println(dataModificada.getDayOfMonth()); // dia
        System.out.println(dataModificada.isLeapYear()); // retorna se o ano é bisexto ou não
        System.out.println(dataModificada.lengthOfMonth()); // para saber quantos dias tem o mes
        System.out.println(dataModificada);
        System.out.println("");
        System.out.println("Pegando a data do sistema");
        LocalDate dataAgora = LocalDate.now();
        System.out.println(dataAgora);
    }

}

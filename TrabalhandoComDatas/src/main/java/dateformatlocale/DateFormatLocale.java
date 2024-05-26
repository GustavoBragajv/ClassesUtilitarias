/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dateformatlocale;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author hbraga
 */
public class DateFormatLocale {
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);

        System.out.println(Locale.getDefault()); // Verificando a localidade do sistema
        String hojeFormatado = DateFormat.getInstance().format(hoje); // formatando a data de acordo com o fuso horário do sistema.
        System.out.println(hojeFormatado);
        System.out.println();
         // Mundando a localidade do servidor ou sistema do computador
        Locale.setDefault(new Locale("pt", "Brazil")); // formatando no padrão do brasil (Este tipo de formatação também está depreciado)
        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);
        System.out.println();

        // Pegando somente o horário
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);
        System.out.println();

        // Pegando somente a data
        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado); // Aqui a data está formatada como (dd/MMM/YYY) por isso que está saindo o mês em string e não em números.
        System.out.println();

        // Também tem outros tipos de formatação de datas
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);
        System.out.println();

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado);
        System.out.println();

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);
        System.out.println();

        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);
        System.out.println();

        // Convertendo datas em formatos Strings para Objetos do tipo Date

        String data = "25/10/1997 16:48";
        try {
            Date dataDate = DateFormat.getInstance().parse(data);
            System.out.println(dataDate);

            // Convertendo o dataDate em Calendar
            Calendar dataCalendar = Calendar.getInstance();
            dataCalendar.setTime(dataDate);
            System.out.println(dataCalendar);

        } catch (ParseException e) {
            throw new RuntimeException("Error data inválida!");
        }
    }
}

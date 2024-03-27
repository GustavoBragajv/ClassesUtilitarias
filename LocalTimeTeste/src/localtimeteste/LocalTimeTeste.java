package localtimeteste;

import java.time.LocalTime;


public class LocalTimeTeste {

    public static void main(String[] args) {
        System.out.println("Hora modificada");
        LocalTime horas = LocalTime.of(23, 15, 25);
        System.out.println(horas);
        
        System.out.println("");
        System.out.println("Hora do sistema");
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual); // Hora, minuto, segundos, e nanosegundos
        System.out.print(horaAtual.getHour() + ":"); // somente a hora
        System.out.print(horaAtual.getMinute() + ":"); // somente os minutos
        System.out.println(horaAtual.getSecond()); // somente os segundos
    }

}

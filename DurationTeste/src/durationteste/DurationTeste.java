package durationteste;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DurationTeste {

    public static void main(String[] args) {
        // Classe usada para trabalhar com a quantidade de tempo.
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime anosFrente = LocalDateTime.now().plusYears(3).plusMinutes(15);
        LocalTime horaAtual = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(8);
        Duration d1 = Duration.between(agora, anosFrente);
        System.out.println(d1);
        
    }

}

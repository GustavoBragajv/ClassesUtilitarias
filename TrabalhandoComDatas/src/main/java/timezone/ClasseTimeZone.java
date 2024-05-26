package timezone;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class ClasseTimeZone {
    public static void main(String[] args) {
        Calendar dataCalendar = Calendar.getInstance();
        TimeZone dataTimeZone = dataCalendar.getTimeZone();
        System.out.println(dataTimeZone);
        System.out.println();

        // Para verificar todos os fusos horários que existe podemos fazer como abaixo
        String[] fusos = TimeZone.getAvailableIDs();
        for(String fuso : fusos){
            System.out.println(fuso);
        }
        System.out.println();

        TimeZone timeZoneSP = TimeZone.getTimeZone("America/Sao_Paulo");
        System.out.println(timeZoneSP.getDisplayName());
        System.out.println(timeZoneSP.getID());
        System.out.println();

        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss");
        System.out.println(sdf.format(agora.getTime()));
        System.out.println();

        Calendar agoraSP = Calendar.getInstance(timeZoneSP);
        System.out.println(agoraSP.getTimeZone());
        System.out.println(sdf.format(agoraSP.getTime()));
        System.out.println();

        agoraSP.add(Calendar.HOUR_OF_DAY,
                timeZoneSP.getOffset((System.currentTimeMillis())) / 1000 / 60 / 60);
        System.out.println(sdf.format(agoraSP.getTime()));
    }
}
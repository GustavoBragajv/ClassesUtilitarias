package formatandodatas;

import java.text.DateFormat;
import java.util.Calendar;


public class FormatandoDatas {

    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        DateFormat[] df = new DateFormat[6];
        
        //df[0] = DateFormat.getTnstance();// não da para usar
        /*
            A forma como será mostrado a formatação é de acordo com o sistema
            operacional.
        */
        df[0] = DateFormat.getDateInstance();
        df[1] = DateFormat.getDateTimeInstance();
        df[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[4] = DateFormat.getDateInstance(DateFormat.LONG);
        df[5] = DateFormat.getDateInstance(DateFormat.FULL);
        
        for(DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendario.getTime()));
        }
    }

}

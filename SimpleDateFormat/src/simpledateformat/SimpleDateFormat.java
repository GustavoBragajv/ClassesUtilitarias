package simpledateformat;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class SimpleDateFormat {

    public static void main(String[] args) {
        String pattern = "'Hamburgo' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try{
            System.out.println(sdf.parse("Hamburgo 27 de Marsch de 2024"));
        } catch(ParseException e) {
            e.printStackTrace();
        }
    }

}

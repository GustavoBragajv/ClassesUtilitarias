package simpledateformat;

import java.util.Date;
import java.text.SimpleDateFormat;


public class SimpleDateFormat {

    public static void main(String[] args) {
        String pattern = "'Hamburgo' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }

}

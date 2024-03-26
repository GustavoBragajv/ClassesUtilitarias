package numeroslocale;

import java.text.NumberFormat;
import java.util.Locale;


public class NumerosLocale {

    public static void main(String[] args) {
        // Formatação de números levando em consideração a localização(País).
        Locale localeDE = Locale.GERMANY;
        Locale localeFR = Locale.FRANCE;
        Locale localeCH = Locale.CHINA;
        Locale localeCA = Locale.CANADA;
        
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localeDE);
        nfa[1] = NumberFormat.getInstance(localeFR);
        nfa[2] = NumberFormat.getInstance(localeCH);
        nfa[3] = NumberFormat.getInstance(localeCA);
        
        double valor = 100_000_000.2130;
        for(NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }

}

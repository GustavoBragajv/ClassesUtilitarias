package formatacaomoedas;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class FormatacaoMoedas {

    public static void main(String[] args) {
        // Formatação de moedas.
        Locale localeDE = Locale.GERMANY;
        Locale localeFR = Locale.FRANCE;
        Locale localeCH = Locale.CHINA;
        Locale localeCA = Locale.CANADA;
        
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeFR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeCH);
        nfa[3] = NumberFormat.getCurrencyInstance(localeCA);
        double valor = 100.2130;
        for(NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits()); // Forma de saber quantos digitos fracionarios tem cada moeda;
            System.out.println(numberFormat.format(valor));
        }
        
        String valorString = "100,21 €";
        try{
            System.out.println(nfa[0].parse(valorString));
        } catch(ParseException e) {
            e.printStackTrace();
        }
    }

}

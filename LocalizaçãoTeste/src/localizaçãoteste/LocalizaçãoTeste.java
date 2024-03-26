package localizaçãoteste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;


public class LocalizaçãoTeste {

    public static void main(String[] args) {
        // Iso representando a lingua e a outra o pais
        Locale local = new Locale("De", "De"); // Não usar esse formato (Depreciado)
        Locale localeItalia = new Locale("it", "it"); // Não usar esse formato (Depreciado)
        Calendar calendario = Calendar.getInstance();
        DateFormat localItalia = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
        DateFormat localAle = DateFormat.getDateInstance(DateFormat.FULL, local);
        System.out.println("Germany: " + localAle.format(calendario.getTime()));
        System.out.println("Italia: " + localItalia.format(calendario.getTime()));
        
        System.out.println("");
        // Como saber como nosso sistema operacional esta configurado
        System.out.println(Locale.getDefault());
        String[] isoPaises = Locale.getISOCountries();
        String[] isoLinguas = Locale.getISOLanguages();
        
        System.out.println("Todos os países que são suportados");
        for(String isoPais : isoPaises) {
            System.out.print(isoPais + ", ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Todos as linguas que são suportadas");
        for(String isoLingua : isoLinguas) {
            System.out.print(isoLingua + ", ");
        }
    }

}

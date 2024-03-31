package regexteste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTeste {

    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");// matcher.start() nos retorna os indeces do que estamos procurando
        }
        System.out.println("");
    }
    
}

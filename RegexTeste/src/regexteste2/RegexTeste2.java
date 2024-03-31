package regexteste2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTeste2 {
    
    public static void main(String[] args) {
        // \d = retorna todos os digitos 0-9
        // \D = retorna tudo o que não for digitos
        // \w = retorna todas as letras a-z, A-Z e todos os digitos 0-9 e _
        // \W = retorna tudo o que for diferente do w minúsculo.
        // \s = retorna todos os espaços em branco \t \n \f \r
        // \S = retorna todos os caracteres que não forem espaços
        
        // adicionando novos conceitos
        // [tudo o que estiver dentro dos colchetes será representado como um range de caracteres]
        String texto = "abababa";
        String regex = "[a-zA-F]"; // passando um range de caracteres para ser procurado no texto.
        String texto1 = "Eu serei PROGRAMADOR um dia, Eu tenho certeza, so preciso ter mais FOCO";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto1);
        
        System.out.println("Texto:  " + texto1);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");// matcher.start() nos retorna os indices do que estamos procurando
            // matcher.group() retorna os valores dos indices que estamos procurando
        }
        System.out.println("");
    }
}

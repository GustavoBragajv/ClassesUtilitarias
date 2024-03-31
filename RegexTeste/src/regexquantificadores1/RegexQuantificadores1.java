package regexquantificadores1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantificadores1 {
    
    public static void main(String[] args) {
        // fazendo um pequeno exercicio
    
        // Quantificadores
        
        // \d = retorna todos os digitos 0-9
        // \D = retorna tudo o que não for digitos
        // \w = retorna todas as letras a-z, A-Z e todos os digitos 0-9 e _
        // \W = retorna tudo o que for diferente do w minúsculo.
        // \s = retorna todos os espaços em branco \t \n \f \r
        // \S = retorna todos os caracteres que não forem espaços
        
        // adicionando novos conceitos
        // [tudo o que estiver dentro dos colchetes será representado como um range de caracteres]
        
        // ? Zero ou uma ocorrência
        // * Zero ou mais ocorrências
        // + Uma ou mais ocorrências
        // {n até m} de um valor de ocorrências até outro.
        
        
        // () representa agrupamento
        // | representa 'ou'
        // $ representa o fim da linha
        // . representa um caracter coringa 

        System.out.println("");
        System.out.println("======================================================================");
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // passando um range de caracteres para ser procurado no texto.
        String emails = "emailqualquer@hotmail.com, 456manjaro@outlook.com.br, @#$fedora@mail.br, regex@gmail.com, malibu@mail.com";
        //String texto = "abababa";
        //String texto1 = "Eu serei PROGRAMADOR um dia, Eu tenho certeza, so preciso ter mais FOCO";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emails);
        
        System.out.println("Texto:  " + emails);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        
        System.out.println("");
        System.out.println("======================================================================");
        System.out.println("Validando as expressões regulares");
        // para validar as expressões regulares podemos usar o método matches da classe String
        System.out.println("@#$fedora@mail.br".matches(regex));
        System.out.println(emails.split(",")[1].trim());
        System.out.println("");
        System.out.println("======================================================================");
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");// matcher.start() nos retorna os indices do que estamos procurando
            // matcher.group() retorna os valores dos indices que estamos procurando
        }
        System.out.println("");
    }
    
}

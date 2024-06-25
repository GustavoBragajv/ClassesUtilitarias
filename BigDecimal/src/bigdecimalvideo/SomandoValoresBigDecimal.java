package bigdecimalvideo;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class SomandoValoresBigDecimal {
    public static void main(String[] args) {
        System.out.println("Somando valores com a classe BigDecimal");
        
        
        // Lembrar sempre de passar os parâmetros para a classe como String.
        BigDecimal valor1 = new BigDecimal("0.1");
        BigDecimal valor2 = new BigDecimal("0.2");
        
        System.out.println("O valor da soma é igual a: " + valor2.add(valor1));
        
        // Sempre lembrar que a classe bigdecimal não aceita dizima periodica na divisão.
        
        BigDecimal valor3 = new BigDecimal("1");
        BigDecimal valor4 = new BigDecimal("3");
        
        // Essa divisão vai gerar uma exceção
        //System.out.println(valor3.divide(valor4));
        
        // Para que não gere a exceção podemos fazer como mostrado abaixo.
        System.out.println(valor3.divide(valor4, 2, RoundingMode.DOWN));
        // Sendo que o valor 2 é o número de casas que queremos que ele mostre
        // e o RoundingMode é o arredondamento que ele faz.
        // DOWN é para baixo, UP é para cima e assim vai....
    }
}

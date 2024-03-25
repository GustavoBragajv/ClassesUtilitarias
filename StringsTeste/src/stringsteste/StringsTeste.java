/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringsteste;

import java.util.Iterator;

/**
 *
 * @author higor
 */
public class StringsTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        System.out.println("String são IMUTÁVEIS");
        String nome = " Higor "; // String constant pool
        String nome2 = "Higor";
        nome.concat("Gustavo");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Higor");
        System.out.println(nome2 == nome3.intern());
        
        System.out.println("Alguns métodos da classe String");
        System.out.println(nome.charAt(0));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());
        System.out.println(nome.replace("i", "y"));
        System.out.println(nome.trim());
        System.out.println();
        */
        
        
        System.out.println("Verificando Performace de Strings");
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");
        
        System.out.println("");
        
        System.out.println("Verificando Performace de StringBuilder");
        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");
        
        System.out.println("");
        
        System.out.println("Verificando Performace de StringBuffer");
        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms");
    }
    
    
    public static void concatString(int tamanho) {
        String texto = "";
        
        for (int i= 0; i < tamanho; i++) {
            texto += i;
        }
    }
    
    
    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    
    
    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
    
}

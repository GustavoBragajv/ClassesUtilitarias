/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

import java.util.Date;

/**
 *
 * @author hbraga
 */
public class ClasseDate {
    public static void main(String[] args) {
        System.out.println("Trabalhando com a classe Date");
        
        Date hoje = new Date();
        
        System.out.println(hoje);
        
        System.out.println(hoje.getTime()); // mostra os milesegundos deste 1 janeiro de 1970
        
        System.out.println(hoje.getDate()); // pega o dia do mês (Não usar mais metodo depreciado)
    }
}

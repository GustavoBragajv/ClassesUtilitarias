/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classerandom;

import java.util.Random;

/**
 *
 * @author hbraga
 */
public class ClasseRandom {

    public static void main(String[] args) {
        // Gerando números aleatorios
        
        // Primeira forma de gerar valores aleatorios
        System.out.println(Math.floor(Math.random() * 10));
        System.out.println("");
        
        // Usando a classe Random
        Random valoresAleatorios = new Random();
        
        System.out.println(valoresAleatorios.nextInt(10 + 1));
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(valoresAleatorios.nextInt(10 + 1));
        }
    }
}

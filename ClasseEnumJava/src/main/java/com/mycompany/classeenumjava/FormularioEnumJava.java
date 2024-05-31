/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeenumjava;

/**
 *
 * @author hbraga
 */
public class FormularioEnumJava {
    enum Genero {
        FEMININO('F'), MASCULINO('M');
        
        private char valor;

        private Genero(char valor) {
            this.valor = valor;
        }
        
        private String nome;
        private Genero genero;
    }
}

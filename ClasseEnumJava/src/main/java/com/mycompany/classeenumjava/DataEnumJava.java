/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeenumjava;

/**
 *
 * @author hbraga
 */
public class DataEnumJava {
    
    private int dia;
    private int mes;
    private int ano;
    private ClasseEnumJava classeEnumJava;
    
    public DataEnumJava() {
        super();
    }
    
    public DataEnumJava(int dia, int mes, int ano, ClasseEnumJava classeEnumJava) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.classeEnumJava = classeEnumJava;
    }
    
    
    public int getDia() {
        return dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public ClasseEnumJava getClasseEnumJava() {
        return classeEnumJava;
    }
    
    public void setClasseEnumJava(ClasseEnumJava classeEnumJava) {
        this.classeEnumJava = classeEnumJava;
    }
}

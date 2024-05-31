package com.mycompany.classeenumjava;

public class ClasseEnumTesteJava {
    
    public static void main(String[] args) {
        
        ClasseEnumJava diaSemana = ClasseEnumJava.DOMINGO;
        
        System.out.println(diaSemana.toString() + " = " + diaSemana.getValorDiaSemana());
        System.out.println("");
        
        DataEnumJava data = new DataEnumJava(25, 10, 1997, ClasseEnumJava.SABADO);
    }
}

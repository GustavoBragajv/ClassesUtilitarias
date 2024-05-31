package com.mycompany.classeenumjava;

public enum ClasseEnumJava {
    DOMINGO(0), SEGUNDA(1), TERCA_FEIRA(2), QUARTA_FEIRA(3),
    QUINTA_FEIRA(4), SEXTA_FEIRA(5), SABADO(6);
    
    
    private int valorDiaSemana;
    
    private ClasseEnumJava(int valorDiaSemana) {
        this.valorDiaSemana = valorDiaSemana;
    }
    
    public int getValorDiaSemana() {
        return valorDiaSemana;
    }
}

package com.mycompany.enumeradoresenum;

public class EnumeradoresEnumTeste {

    public static void main(String[] args) {

        imprimirDiaSemanaConstante();
        System.out.println("");
        imprimirEnum();
    }

    private static void imprimirDiaSemanaConstante() {

        int domingo = EnumeradoresEnum.DOMINGO;
        int segunda = EnumeradoresEnum.SEGUNDA_FEIRA;
        int terca = EnumeradoresEnum.TERCA_FEIRA;
        int quarta = EnumeradoresEnum.QUARTA_FEIRA;
        int quinta = EnumeradoresEnum.QUINTA_FEIRA;
        int sexta = EnumeradoresEnum.SEXTA_FEIRA;
        int sabado = EnumeradoresEnum.SABADO;

        System.out.println("Teste utilizando constante no Java");
        imprimirDiaSemana(domingo);
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);

    }

    private static void imprimirDiaSemana(int dia) {
        switch (dia) {
            case 0:
                System.out.println("Hoje é: Domingo");
            case 1:
                System.out.println("Hoje é: Segunda-Feira");
                break;
            case 2:
                System.out.println("Hoje é: Terça-Feira");
                break;
            case 3:
                System.out.println("Hoje é: Quarta-Feira");
                break;
            case 4:
                System.out.println("Hoje é: Quinta-Feira");
                break;
            case 5:
                System.out.println("Hoje é: Sexta-Feira");
                break;
            case 6:
                System.out.println("Hoje é: Sábado");
                break;
        }
    }

    private static void imprimirEnum() {
        DiaSemanaJavaEnum domingo = DiaSemanaJavaEnum.DOMINGO;
        DiaSemanaJavaEnum segunda = DiaSemanaJavaEnum.SEGUNDA;
        DiaSemanaJavaEnum terca = DiaSemanaJavaEnum.TERCA;
        DiaSemanaJavaEnum quarta = DiaSemanaJavaEnum.QUARTA;
        DiaSemanaJavaEnum quinta = DiaSemanaJavaEnum.QUINTA;
        DiaSemanaJavaEnum sexta = DiaSemanaJavaEnum.SEXTA;
        DiaSemanaJavaEnum sabado = DiaSemanaJavaEnum.SABADO;

        System.out.println("Teste utilizando enum no Java.");
        imprimirDiaSemanaEnum(domingo);
        imprimirDiaSemanaEnum(segunda);
        imprimirDiaSemanaEnum(terca);
        imprimirDiaSemanaEnum(quarta);
        imprimirDiaSemanaEnum(quinta);
        imprimirDiaSemanaEnum(sexta);
        imprimirDiaSemanaEnum(sabado);

    }

    private static void imprimirDiaSemanaEnum(DiaSemanaJavaEnum dia) {
        switch (dia) {
            case DOMINGO:
                System.out.println("Hoje é: Domingo");
                break;
            case SEGUNDA:
                System.out.println("Hoje é: Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Hoje é: Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Hoje é: Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Hoje é: Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Hoje é: Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Hoje é: Sábado");
                break;
        }
    }

}

package calendar;

import java.util.Calendar;

public class ClasseCalendar {

    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance(); // padrão de projetos (singleton)

        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int mes = hoje.get(Calendar.MONTH); // em java o mês começa do zero // nesse caso mes 4 é maio.
        int ano = hoje.get(Calendar.YEAR);
        int hora = hoje.get(Calendar.HOUR);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        System.out.printf("Data: %d/%02d/%d%n", dia, (mes + 1), ano);
        System.out.printf("Agora são %02d:%02d:%02d", hora, minutos, segundos);

        // Também podemos adicionar e remover datas usando o metodo (add)

        hoje.add(Calendar.DAY_OF_MONTH, + 1); // adicionando um dia
        hoje.add(Calendar.DAY_OF_MONTH, -1); // removendo um dia
    }
}

package simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatacaoDataJava {
    public static void main(String[] args) {
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");

        Date data = new Date();

        // Data sem formatação
        System.out.println(data);

        // Data com formatação
        String dataformatada = formatadorData.format(data);

        System.out.println(dataformatada);

        // Também podemos converter datas em Strings para um objeto em data.

        String minhadata = "25/10/1997";
        SimpleDateFormat formatandominhadata = new SimpleDateFormat("dd/MM/yyy");
        try {
            Date minhadataformatada = formatandominhadata.parse(minhadata);
            System.out.println(minhadataformatada);
            System.out.println(formatandominhadata.format(minhadataformatada));
        } catch (ParseException e) {
            throw new RuntimeException("Error data inválida!");
        }
    }
}
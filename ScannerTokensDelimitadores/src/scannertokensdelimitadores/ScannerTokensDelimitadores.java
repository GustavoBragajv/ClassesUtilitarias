package scannertokensdelimitadores;

public class ScannerTokensDelimitadores {

    public static void main(String[] args) {
        String texto = "Wanda, Doutor Estranho, Muller";
        String[] nomes = texto.split(",");
        for(String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
    
}

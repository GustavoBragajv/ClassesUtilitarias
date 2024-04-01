package scannertokensdelimitadores1;

import java.util.Scanner;


public class ScannerTeste1 {
    public static void main(String[] args) {
        String texto = "Ronaldinho,Michael Jackson,Grover,Zoe doce Amarga,200,false";
        Scanner scan = new Scanner(texto);
        scan.useDelimiter(",");
        while(scan.hasNext()) {
            if(scan.hasNextInt()) {
                int i = scan.nextInt();
                System.out.println("Int " + i);
            } else if(scan.hasNextBoolean()) {
                boolean b = scan.nextBoolean();
                System.out.println("Boolean " + b);
            } else {
                System.out.println(scan.next());
            }
        }
    }
}

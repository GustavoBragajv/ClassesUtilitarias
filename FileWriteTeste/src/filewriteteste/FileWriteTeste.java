package filewriteteste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriteTeste {

    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Eu serei um programador e irei morar na alemanha\n");
            fw.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        
    }

}

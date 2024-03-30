package resourcebundleteste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste {


    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundleTeste = ResourceBundle.getBundle("messages", new Locale("de", "DE"));
        System.out.println(bundleTeste.getString("hallo"));
    }

}

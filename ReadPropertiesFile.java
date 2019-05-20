import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {

    public static void main(String[] args) {

        try (InputStream input = new FileInputStream("/Users/tiffanypena/Desktop/ProgThermo/src/main/java/settings.properties")) {

            Properties prop = new Properties();

            if (input == null){
                System.out.println("Cannot find file.");
            }


            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("Wednesday"));
            System.out.println(prop.getProperty("Friday"));


        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}

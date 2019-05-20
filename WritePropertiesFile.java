import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertiesFile
{

        public static void main(String[] args) {

            try (OutputStream output = new FileOutputStream("/Users/tiffanypena/Desktop/ProgThermo/src/main/java/settings.properties")) {

                Properties prop = new Properties();

                // set the properties value
                prop.setProperty("Wednesday", "Temp: 60");
                prop.setProperty("Friday", "Temp: 70");
                prop.setProperty("Saturday", "Temp: 75");

                // save properties to project root folder
                prop.store(output, null);

                System.out.println(prop);

            } catch (IOException io){
                io.printStackTrace();
            }

        }
    }

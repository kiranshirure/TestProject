package Utils;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesReader {
    private static Properties properties = null;
    private final static String pathToConfigFile = "src//config//config.properties";

    private final static String pathToUserDetailsFile = "src//TestData//UserInfo.properties";
    private static String filePointer = "";

    private static Properties setProperties(String fileName) throws FileNotFoundException,
            IOException {
        properties = new Properties();
        if(pathToConfigFile.contains(fileName)) {
            properties.load(new FileInputStream(pathToConfigFile));
            filePointer = pathToConfigFile;

        } else if(pathToUserDetailsFile.contains(fileName)) {
            properties.load(new FileInputStream(pathToUserDetailsFile));
            filePointer = pathToUserDetailsFile;
        }
        return properties;
    }

    public static String getProperty(String fileName, String key) {
        if(!(properties != null && filePointer.contains(fileName))) {
            try {
                setProperties(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties.getProperty(key);
    }


}
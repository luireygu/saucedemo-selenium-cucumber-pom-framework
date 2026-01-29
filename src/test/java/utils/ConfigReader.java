package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    private ConfigReader() {}

    static {
        try {
            properties = new Properties();
            InputStream input = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config/config.properties");

            if (input == null) {
                throw new RuntimeException("No se encontró config.properties");
            }

            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Error cargando config.properties", e);
        }
    }



    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}

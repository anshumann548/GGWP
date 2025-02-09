package com.ggwp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    private static Properties properties = new Properties();

    public static void loadProperties() {
        try {
            FileInputStream input = new FileInputStream("./src/main/resources/config.properties");
            properties.load(input);
            input.close(); // Close the input stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties getProperty() {
        return properties;
    }
}
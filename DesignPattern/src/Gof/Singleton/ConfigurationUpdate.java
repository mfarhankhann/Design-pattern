/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.Singleton;

/**
 *
 * @author fa20-bse-069
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.HashMap;

public class ConfigurationUpdate {
    private static volatile ConfigurationUpdate instance;
    private HashMap<String, String> config = new HashMap<String, String>();

    private ConfigurationUpdate() {
        try {
            File file = new File("config.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();

            Enumeration<Object> enuKeys = properties.keys();

            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                String value = properties.getProperty(key);
                config.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        String value = null;
        if (config.containsKey(key)) {
            value = config.get(key);
        }
        return value;
    }

    public static ConfigurationUpdate getInstance() {
        if (instance == null) {
            synchronized (ConfigurationUpdate.class) {
                if (instance == null) {
                    instance = new ConfigurationUpdate();
                }
            }
        }
        return instance;
    }
}


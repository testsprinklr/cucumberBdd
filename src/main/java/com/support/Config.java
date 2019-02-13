package com.support;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class Config {

    private static String configFile = "Config.properties";
    private static Configuration configuration;

    private static final String BROWSER = "selenium.browser";
    private static final String ENVIRONMENT_PROFILE = "environment.profile";

    public static String loadAndGetResourceLocation(String fileName) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return classLoader.getResource(fileName).toString();
    }

    public static void loadConfig() {
        getInstance();
    }

    public static Configuration getInstance() {
        if (configuration == null) {
            try {
                configuration = new PropertiesConfiguration(loadAndGetResourceLocation(configFile));
            } catch (ConfigurationException e) {
                e.printStackTrace();
            }
        }
        return configuration;
    }

    public static String getBrowser() {
        return configuration.getString(BROWSER);
    }

    public static String getEnvironmentProfile() {
        return configuration.getString(ENVIRONMENT_PROFILE);
    }

}

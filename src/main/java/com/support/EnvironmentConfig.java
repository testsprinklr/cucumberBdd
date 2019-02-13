package com.support;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.net.URISyntaxException;

public class EnvironmentConfig {

    protected static XMLConfiguration config = null;

    public EnvironmentConfig() {
        if (config == null) {
            loadConfig();
        }
    }

    public static void loadConfig() {
        String xmlFile = Config.getEnvironmentProfile();
        String configFile = xmlFile + ".xml";
        try {
            config = new XMLConfiguration(loadAndGetResourceLocation(configFile));
        } catch (ConfigurationException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static String loadAndGetResourceLocation(String fileName) throws URISyntaxException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return classLoader.getResource(fileName).toString();
    }

    public static String getAppUrl() {
        return config.getString("Environment/appUrl");
    }

    public static void main(String[] args) {
        Config.loadConfig();
        EnvironmentConfig.loadConfig();
        System.out.println(EnvironmentConfig.getAppUrl());
    }

}

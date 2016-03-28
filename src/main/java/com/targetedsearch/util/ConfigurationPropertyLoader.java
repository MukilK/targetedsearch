package com.targetedsearch.util;

import org.apache.commons.configuration2.*;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;



public final class ConfigurationPropertyLoader {

  private static Configuration config;

  private ConfigurationPropertyLoader() {}

  static {
    Parameters params = new Parameters();
    FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
        new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
            .configure(params.properties().setFileName("Configuration.properties"));
    try {
      config = builder.getConfiguration();
    } catch (ConfigurationException cex) {
      // loading of the configuration file failed
    }
  }

  public static String getMessage(String key) {
    return config.getString(key);
  }

  public static int getAsInt(String key) {
    return config.getInt(key);
  }

}
package br.com.rsi.bdd.dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import br.com.rsi.hub.enums.DriverType;
import br.com.rsi.hub.enums.EnvironmentType;


public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "configs//Configuration.properties";
	
	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties não encontrado em " + propertyFilePath);
		}
	}
	
	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException(
					"Driver Path não especificado no arquivo Configuration.properties da chave: driverPath");
	}
	
	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty(
				"implicitlyWait");
		if (implicitlyWait != null) {
			try {
				return Long.parseLong(implicitlyWait);
			} catch (NumberFormatException e) {
				throw new RuntimeException(
						"Não é possivel analisar o valor: " + implicitlyWait + "em Long");
			}
		}
		return 30;
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException(
					"A URL da aplicação não espeficidada no arquivo Configuration.properties da chava: url");
	}
	
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("iexplore"))
			return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException(
					"O nome do browser não corresponde a chave em no arquivo Configuration.properties: " + browserName);
	}
	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if (environmentName == null || environmentName.equalsIgnoreCase("local"))
			return EnvironmentType.LOCAL;
		else if (environmentName.equals("remote"))
			return EnvironmentType.REMOTE;
		else
			throw new RuntimeException(
					"O tipo de ambiente da chave em no arquivo Configuration.properties não corresponde" + environmentName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}
	

}

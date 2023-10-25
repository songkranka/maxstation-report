package report.api.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.lang.Class;

public class PropertiesUtil {
	private static final Properties CONFIG_PROPERTIES = initialInstance();
	
	private static Properties initialInstance(){
        try{
        	File currentJavaJarFile = new File(PropertiesUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath());   
        	String currentJavaJarFilePath = currentJavaJarFile.getAbsolutePath();
        	String currentRootDirectoryPath = currentJavaJarFilePath.replace(currentJavaJarFile.getName(), "");
        	
            Properties prop = new Properties();
            InputStream input = null;
            String configFilePath = currentRootDirectoryPath;
            
            String resourceName = "config.properties";
                       
            ClassLoader classLoader = PropertiesUtil.class.getClassLoader();
            File file = new File(classLoader.getResource(resourceName).getFile());
            String absolutePath = file.getAbsolutePath();
            
            
            System.out.println(">>>>>>>>> " + absolutePath);
            
            if(configFilePath != null){
            	input = new FileInputStream(configFilePath+"config.properties");
            } else {
            	System.out.println(configFilePath);
            	//logger.info("Not found system property : config.properties.path");
            	//ClassLoader classLoader = PropertiesUtil.class.getClassLoader();
            	input = classLoader.getResourceAsStream("config.properties");
            }
            if(input != null){
            	//logger.info("config.properties is loading");
                prop.load(input);
            }
            return prop;
        } catch (Exception e){
        	//logger.error(e.getMessage(), e);
            throw new RuntimeException(e.getMessage(), e);
        }
    }
    
    public static String getProperties(String keyName){
        String value = System.getenv(keyName);
        if(value == null || "".equals(value)){
            value = CONFIG_PROPERTIES.getProperty(keyName);
        } 
        return value;
    }
}

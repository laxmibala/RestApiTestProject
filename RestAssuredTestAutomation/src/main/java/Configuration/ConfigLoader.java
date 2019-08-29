package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private static ConfigLoader config;
    private static String basePath;

    private ConfigLoader() {
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\laxmi_bala\\Desktop\\Laxmi\\Project\\RestApiTestProject\\RestAssuredTestAutomation\\src\\main\\resources\\application.properties");
            Properties prop = new Properties();
            prop.load(inputStream);
            setBasePath(prop.getProperty("base_path"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String getBasePath() {
        if (config == null)
            config = new ConfigLoader();
        return basePath;
    }

    private static void setBasePath(String url) {
        basePath = url;
    }
}

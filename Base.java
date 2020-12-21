package BasePck;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    public  Base() throws FileNotFoundException {

        try {
            prop = new Properties();
            FileInputStream fp = new FileInputStream("R:\\SauceDemo\\src\\main\\java\\config\\config.properties");
            prop.load(fp);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

        public static void intialization() {
            String browserName = prop.getProperty("browser");

            if (browserName.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }

            // driver.manage().window().maximize();
            //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             driver.get(prop.getProperty("url"));
            }
}




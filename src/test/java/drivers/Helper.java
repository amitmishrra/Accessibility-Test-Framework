package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Helper {

    private Helper(){}

    public static WebDriver driver;
//    @BeforeMethod
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

@Test
public static void get(String link){
    driver.get(link);
}

    public static void click(By by){
        driver.findElement(by).click();
    }

    public static void sendKeys(By by, String value){
        driver.findElement(by).sendKeys(value);

    }

    public static String getText(By by){
      return   driver.findElement(by).getText();
    }
    public static void quite(){
        driver.quit();
    }

}

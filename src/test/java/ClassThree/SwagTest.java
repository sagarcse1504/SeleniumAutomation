package ClassThree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Thread.sleep(2000);
        driver.quit();
    }
}

package ClassOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver  driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.quit();
    }
}

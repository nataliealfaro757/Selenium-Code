package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver=new ChromeDriver();

        //maximize
        driver.manage().window().maximize();

        //go to amazon
        driver.get("https://www.amazon.com/");

        //print all the links in  amazon.com
        driver.findElements(By.tagName("a"));

        // to be continued in the next class

    }
}

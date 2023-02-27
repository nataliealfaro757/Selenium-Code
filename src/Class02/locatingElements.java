package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // create an instance of WedDriver
        WebDriver driver=new ChromeDriver();

        // open up facebook.com
        driver.get("https://www.facebook.com/");

        //send in the username
        driver.findElement(By.id("email")).sendKeys("moazzam");

        //send the password
        driver.findElement(By.name("pass")).sendKeys("abracdabra");

        //click on the button create New Account
        driver.findElement(By.linkText("Create new account")).click();

        // Click on Forgotten Password

        driver.findElement(By.partialLinkText("password?" ));

        driver.quit();
    }
}

package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {

//connect to the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

//create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

//goto google.com
        driver.get("http://www.google.com/");
//Class01.maximize the window
        driver.manage().window().maximize();
//fullscreen
        driver.manage().window().fullscreen();


driver.close();



    }
}

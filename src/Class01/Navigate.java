package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[]args) throws InterruptedException {

        //connect to webDrive
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //open google.com
        driver.get("http://www.google.com/");

        //slow down
        Thread.sleep(2000);


// now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com");

        //slow down
        Thread.sleep(2000);

//   go back (Only w navigate)
        driver.navigate().back();

        //slow down
        Thread.sleep(2000);

// goto facebook.com
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();

        //close
        driver.close();

    }
}

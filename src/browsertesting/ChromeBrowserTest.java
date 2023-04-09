package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open the URL into Browser
        driver.get(baseUrl);

        // Print the title of the page
        String title = driver.getTitle();

        System.out.println(title);

        //Print the current URL
        System.out.println("Current URL  :  " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source :   " + driver.getPageSource());

        //Enter the Email field element
        driver.findElement(By.id("user[email]")).sendKeys("Prime123@gmail.com");

        //Enter the Password field element
        driver.findElement(By.name("user[password]")).sendKeys("Prime123");

        // Close the Browser
        driver.close();



    }
}

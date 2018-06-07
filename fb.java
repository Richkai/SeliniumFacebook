/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahel12
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

//import java.util.List;
public class fb {
    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver FB = new ChromeDriver();
        FB.get("https://www.facebook.com");

        WebElement user = FB.findElement(By.id("email"));
        user.sendKeys("rechokaguk@gmail.com");

        WebElement pass = FB.findElement(By.id("pass"));
        pass.sendKeys("143abujae");

        WebElement login = FB.findElement(By.id("loginbutton"));

        WebElement btn = login.findElement(By.tagName("input"));

        btn.click();

        WebElement notif = FB.findElement(By.id("notificationsCountValue"));
        String html = notif.getAttribute("innerHTML");

        System.out.println("The number of notifications you currently have is: " + html);
    }
}

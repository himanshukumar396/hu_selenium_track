package mini_assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario_4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\himanshukumar7\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Thread.sleep(3000);

        driver.get("https://www.goibibo.com/ ");
        WebElement round_way = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/ul/li[2]"));
        round_way .click();
        WebElement from = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[1]/div/div/p"));
        from.click();
        //driver.switchTo().alert().sendKeys(" New York");
        //from.sendKeys(" New York");
        driver.findElement(By.id("New York")).sendKeys(Keys.ENTER);
        WebElement to = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div/div/p"));
        to.click();
        //driver.switchTo().alert().sendKeys("Seattle");
        to.sendKeys("Seattle");

    }
}
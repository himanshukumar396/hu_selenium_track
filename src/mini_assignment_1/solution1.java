package mini_assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class solution1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\himanshukumar7\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/flights");
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[2]//div[1]/a/img"));
        WebElement home = driver.findElement(By.xpath("//*[@title=\"home\"]"));
        WebElement hotels = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a"));
        WebElement flights = driver.findElement(By.xpath("//a[text()='flights']"));
        WebElement tours = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]/a"));
        WebElement company = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/nav/ul/li[8]/a"));
        WebElement signup = driver.findElement(By.xpath("//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/a[1]"));
        WebElement login = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div/a[2]"));
        WebElement agents = driver.findElement(By.id("//*[@id=\"agents\"]"));
    }
    }


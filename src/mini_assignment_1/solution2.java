package mini_assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class solution2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\himanshukumar7\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/flights");

        WebElement checkin = driver.findElement(By.xpath("//span[@class='la la-calendar form-icon']//parent::div"));
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[2]/div/div[2]/div/span//parent::div"));
        WebElement adultminus = driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[1]//child::i"));
        WebElement adultplus = driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/i//ancestor::form"));
        WebElement childminus = driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[3]/div/div/div[1]//child::i"));
        WebElement childplus = driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/div/div[3]/div/div/div[2]//parent::div"));
    }
}

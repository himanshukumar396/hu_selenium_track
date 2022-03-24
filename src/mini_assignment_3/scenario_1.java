package mini_assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\himanshukumar7\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Thread.sleep(3000);

        driver.get("https://the-internet.herokuapp.com/ ");

        WebElement frames = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[22]/a"));
        frames.click();

        WebElement nested_frames = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a"));
        nested_frames.click();
    }
}

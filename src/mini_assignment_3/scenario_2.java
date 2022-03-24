package mini_assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\himanshukumar7\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Thread.sleep(3000);

        driver.get(" https://jqueryui.com/droppable/ ");
        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        builder.dragAndDrop(from, to).build().perform();
    }
}

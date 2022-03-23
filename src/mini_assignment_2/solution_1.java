package mini_assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class solution_1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\himanshukumar7\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.get("https://phptravels.com/demo");
        //driver.manage().window().maximize();
        String title1 = driver.getTitle();
        System.out.println("Page title is : " +title1);
        if(title1.contains("PHPTRAVELS")){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }


        String parentWindow = driver.getWindowHandle();
        Thread.sleep(3000);

        WebElement login = driver.findElement(By.xpath("/html/body/header/div/nav/a[4]"));
        login.click();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        String title2 = driver.getTitle();
        System.out.println("Page title is : " + title2);
        if(title2.contains("Login")){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        Thread.sleep(5000);
        driver.switchTo().window(parentWindow);

        String URL = driver.getCurrentUrl();
        System.out.println("URL of the current page : " + URL);

        Thread.sleep(4000);

        WebElement pricing = driver.findElement(By.xpath("/html/body/header/div/nav/a[2]"));
        pricing.click();

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();





    }
}

package mini_assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\himanshukumar7\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Thread.sleep(3000);

        driver.get("https://the-internet.herokuapp.com/ ");
        WebElement javascript_alerts = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a"));
        javascript_alerts.click();
        WebElement js_prompts = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        js_prompts.click();
        System.out.println("Alert text is: " +driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Test");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        WebElement results = driver.findElement(By.xpath("//*[@id=\"result\"]"));
        String result = results.getText();
        if(result.contains("Test")){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }


        driver.get("https://the-internet.herokuapp.com/drag_and_drop ");
        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
        WebElement to = driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
        String xto=Integer.toString(to.getLocation().x);
        String yto=Integer.toString(from.getLocation().y);
    ((JavascriptExecutor)driver).executeScript("function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; " +
    "simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
    from,xto,yto);
        //builder.dragAndDrop(from, to).build().perform();
        //JavascriptExecutor js = (JavascriptExecutor)driver;

    }
}

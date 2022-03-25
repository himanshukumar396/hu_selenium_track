import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class products extends login {
    public static void product_sort(){
        products p = new products();
        WebDriver driver = null;
        WebElement sort = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        sort.click();

        WebElement high_to_low = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]"));
        high_to_low.click();

    }

    public static  void AddCart() throws InterruptedException {
        WebDriver driver = null;
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        cart.click();

        Thread.sleep(5000);

        WebElement remove_product = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]"));
        remove_product.click();

        Thread.sleep(5000);

        WebElement add_cart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        add_cart.click();
        WebElement sort2 = driver.findElement(By.xpath("//*[@id='header_container']//span/select"));
        sort2.click();
        Thread.sleep(3000);
        WebElement HighToLow1 = driver.findElement(By.xpath("//*[@id='header_container']//select/option[4]"));
        HighToLow1.click();
        Thread.sleep(3000);
        WebElement HighestPricedProduct1 = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        HighestPricedProduct1.click();
        Thread.sleep(3000);
        WebElement sort1 = driver.findElement(By.xpath("//*[@id='header_container']//span/select"));
        sort1.click();
        Thread.sleep(3000);
        WebElement LowToHigh = driver.findElement(By.xpath("//*[@id='header_container']//select/option[3]"));
        LowToHigh.click();
        Thread.sleep(3000);
        WebElement LowestPricedProduct = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']"));
        LowestPricedProduct.click();
        Thread.sleep(3000);
        WebElement cart3 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart3.click();
        Thread.sleep(3000);
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        Thread.sleep(3000);



    }
}

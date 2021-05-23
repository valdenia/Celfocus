package ScreenRetails;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC001 {

    public static WebDriver driver;

    public void openSite(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-automation-challenge.github.io/sandbox/");
    }

    public void selectType(String type){
        Select select = new Select(driver.findElement(By.id("type")));
        select.selectByVisibleText(type);
    }

    public void Select_support_plan(String plan){
        Select select = new Select(driver.findElement(By.id("support")));
        select.selectByVisibleText(plan);
    }

    public void Write_monthly_duration_of(String number){
        By.id("duration").findElement(driver).sendKeys(number);
    }

    public void click_in_calculate_price_button(){
        driver.findElement(By.id("calculate")).click();
    }
    public void i_see_the_correct_price(String price) throws InterruptedException {
        Thread.sleep(5*1000);
        Assert.assertEquals(price, driver.findElement(By.id("price")).getText());
    }
}

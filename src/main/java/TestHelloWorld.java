
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestHelloWorld {

    public static void main(String[] args) {

        //如果火狐浏览器没有默认安装在C盘，需要制定其路径
//        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com/");

        driver.manage().window().maximize();

        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("Glen");
        System.out.println("Text is: " +  txtbox.getText());
        driver.findElement(By.id("su")).click();
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        driver.navigate().to("http://www.google.com");
        driver.navigate().back();
//        driver.quit();

    }

}
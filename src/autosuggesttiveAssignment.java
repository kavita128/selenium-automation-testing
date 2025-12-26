import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggesttiveAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");

        Thread.sleep(3000); // Wait for suggestions to load

        // ✅ Correct XPath — NO extra quote
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }

        Thread.sleep(1000); // Let value update in input field
        String selectedText = driver.findElement(By.id("autocomplete")).getAttribute("value");
        System.out.println("Selected: " + selectedText);

        driver.quit();
    }
}



//import org.openqa.selenium.By;



//import org.openqa.selenium.Keys;



//import org.openqa.selenium.WebDriver;



//import org.openqa.selenium.WebElement;



//import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.support.ui.ExpectedConditions;

//import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.support.ui.WebDriverWait;



//public class Assignment {



//public static void main(String[] args) throws InterruptedException {



// TODO Auto-generated method stub



//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");



   // WebDriver driver = new ChromeDriver();

   // driver.get("http://qaclickacademy.com/practice.php");

    //driver.findElement(By.id("autocomplete")).sendKeys("ind");

    //Thread.sleep(2000);

    //driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

    //driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

   //System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

       

       

//}

//}
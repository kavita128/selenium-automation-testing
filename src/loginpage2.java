import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;



public class loginpage2 {
	public static void main(String[] args) throws InterruptedException {
        // Products to add to cart
        String[] itemsAdd = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};

        // Setup Chrome Options
        ChromeOptions options = new ChromeOptions();

        // Disable browser-level UI popups
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--password-store=basic");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));

        // Disable password manager
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        // Use a clean Chrome profile to avoid stored login warnings
        options.addArguments("user-data-dir=C:/temp/CustomChromeProfile");

        // Launch Chrome
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // Login
        driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

        // Handle user role confirmation popup
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-body")));
        driver.findElement(By.id("okayBtn")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("myModal")));

        // Continue login
        driver.findElement(By.className("form-control")).click();
        driver.findElement(By.xpath("//option[text()='Consultant']")).click();
        driver.findElement(By.cssSelector("#terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        // OPTIONAL: Handle in-page password change popup (if shown)
        try {
            WebElement noButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='NO']")));
            noButton.click();
            wait.until(ExpectedConditions.invisibilityOf(noButton));
        } catch (Exception e) {
            System.out.println("Password warning popup not shown, continuing...");
        }

        // Add products
        List<WebElement> products = driver.findElements(By.cssSelector(".card.h-100"));
        List<String> itemsNeededList = Arrays.asList(itemsAdd);
        int j = 0;

        for (int i = 0; i < products.size(); i++) {
            String productName = products.get(i).findElement(By.cssSelector(".card-title")).getText();
            if (itemsNeededList.contains(productName)) {
                products.get(i).findElement(By.cssSelector(".btn-info")).click();
                j++;
                if (j == itemsAdd.length) break;
            }
        }

        System.out.println("✅ All items added to cart successfully.");

        // Close browser after short pause
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
       driver.findElement(By.cssSelector(".btn.btn-success")).click();
  
    // Use JavaScript to directly set country value
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("document.getElementById('country').value='India';");

       // Wait for a short time to simulate typing delay
       Thread.sleep(1000);

       // Continue with checkbox and purchase
       WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox2")));
       checkbox.click();

       WebElement purchaseButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Purchase']")));
       purchaseButton.click();

       // Print confirmation message
       String part1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success strong"))).getText();
       String part2 = driver.findElement(By.cssSelector(".alert-success")).getText().replace(part1, "").trim();
       System.out.println("✅ " + part1 + " " + part2);
    }
}



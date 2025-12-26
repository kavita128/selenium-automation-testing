import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;



public class Loginpracticepageassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Before initializing ChromeDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");              // Disable popups
		options.addArguments("--disable-infobars");                  // Removes "Chrome is being controlled..."
		options.addArguments("--disable-save-password-bubble");      // Disable password manager
		options.addArguments("--disable-extensions");                // Disable extensions (some trigger popups)
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation")); // Remove automation flag
		
		// Disable Chrome's password manager and credential saving popup
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		

		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
String[] itemsAdd = {"iphone","Samsung", "Nokia", "Blackberry" };
driver.get("https://rahulshettyacademy.com/loginpagePractise/");
driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("password")).sendKeys("learning");
driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-body")));//wait untill popup open
WebElement userPopUp = driver.findElement(By.cssSelector(".modal-body"));
System.out.println(userPopUp.getText());
driver.findElement(By.id("okayBtn")).click();
wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("myModal"))); // Wait until popup closes
driver.findElement(By.className("form-control")).click();
driver.findElement(By.xpath("//option[text()='Consultant']")).click();
driver.findElement(By.cssSelector("#terms")).click();
driver.findElement(By.id("signInBtn")).click();

// Wait for "Change your password?" popup and click "No" if it appears
try {
   
    WebElement noButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='NO']")));
    noButton.click();
    wait.until(ExpectedConditions.invisibilityOf(noButton));  // Ensure it's gone before proceeding
} catch (Exception e) {
    System.out.println("No password change popup appeared, continuing...");
}


List<WebElement> products = driver.findElements(By.cssSelector(".card.h-100"));

List<String> itemsNeededList = Arrays.asList(itemsAdd);
int j = 0;

for (int i = 0; i < products.size(); i++) {
    String productName = products.get(i).findElement(By.cssSelector(".card-title")).getText();

    if (itemsNeededList.contains(productName)) {
        products.get(i).findElement(By.cssSelector(".btn-info")).click();
        j++;
        if (j == itemsAdd.length)
            break;
    }
}
			
}









	}







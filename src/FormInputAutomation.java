import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormInputAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/inputs");
		driver.manage().window().maximize();
		WebElement numberInput =driver.findElement(By.id("input-number"));
		numberInput.sendKeys("-5");
		driver.findElement(By.cssSelector("#input-text")).sendKeys("Kavita");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Kavita@123");
		driver.findElement(By.cssSelector("#input-date")).sendKeys("03/11/2025");
		driver.findElement(By.xpath("//button[@id='btn-display-inputs']")).click();
		
		System.out.println("✅ Number Displayed: " + driver.findElement(By.id("display-input-number")).getText());
        System.out.println("✅ Text: " + driver.findElement(By.id("display-input-text")).getText());
        System.out.println("✅ Password: " + driver.findElement(By.id("display-input-password")).getText());
        System.out.println("✅ Date: " + driver.findElement(By.id("display-input-date")).getText());
        driver.close();
		
		

	}

}

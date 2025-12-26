import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;

public class checkboxclickdetailed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // Static dropdown
        WebElement StaticDropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(StaticDropdown);
        dropdown.selectByIndex(3);
        System.out.println("Selected: " + dropdown.getFirstSelectedOption().getText());

        // Select checkbox
        WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
        System.out.println("Initially selected: " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After click: " + checkbox1.isSelected());

        // Uncheck and assert
        checkbox1.click();
        System.out.println("After unchecking: " + checkbox1.isSelected());
        Assert.assertFalse(checkbox1.isSelected());
        System.out.println("Assertion passed: Checkbox is unselected.");

        // Count checkboxes correctly
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println("Total checkboxes found: " + checkboxes.size());

        driver.quit();
    }


	}



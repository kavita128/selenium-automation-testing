import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProtoCommerceAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Kavita");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("kavitagaddagi1998@gmail.com");
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("Kavita@123");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement staticDropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDown = new Select (staticDropDown);
		dropDown.selectByIndex(1);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("06/27/2025");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		}

}

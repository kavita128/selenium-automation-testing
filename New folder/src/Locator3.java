import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) throws InterruptedException {
		 // TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    //sibling to sibling - child to parent travers
    //header/div/button[1]/following-sibling::button[1]
    
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	//header/div/button[1]/parent::div/button[2]
    //header/div/button[1]/parent::div/parent::header/a
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
	
	}

}

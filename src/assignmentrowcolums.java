import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentrowcolums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,600)");
List<WebElement> visibleRows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
System.out.println("Visible row count: " + visibleRows.size());
List<WebElement> coloumns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
System.out.println("Numer of coloumn - " + coloumns.size());
List<WebElement> secoundRowCells = visibleRows.get(1).findElements(By.tagName("td"));
for(WebElement cell : secoundRowCells )
{ 
	System.out.println(cell.getText());
}
	
	}

}

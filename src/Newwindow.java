import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/angularpractice/");
//Switching window
driver.switchTo().newWindow(WindowType.TAB);
Set<String>handles = driver.getWindowHandles();
Iterator<String> it= handles.iterator();
String parentWindowId = it.next();
String childwindow = it.next();
driver.switchTo().window(childwindow);
driver.get("http://www.rahulshettyacademy.com/");
	String courseName= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get((1)).getText()	;
	driver.switchTo().window(parentWindowId);
	WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		//Screenshot of WebElement
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		//Get Height and widtht 
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
	
	
	
	
	driver.quit();	
	}

}

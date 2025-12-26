import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		WebElement content = driver.findElement(By.id("content"));
        System.out.println("Text inside middle frame: " + content.getText());
		

	}

}

//mport java.util.Iterator;



//import java.util.List;



//import java.util.Set;



//import org.openqa.selenium.By;



//import org.openqa.selenium.WebDriver;



//import org.openqa.selenium.WebElement;



//import org.openqa.selenium.chrome.ChromeDriver;



//public class A2 {



///public static void main(String[] args) {



// TODO Auto-generated method stub





//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");


//WebDriver driver=new ChromeDriver();



//driver.get("http://the-internet.herokuapp.com/");



//driver.findElement(By.linkText("Nested Frames")).click();



//driver.switchTo().frame("frame-top");



//driver.switchTo().frame("frame-middle");



//System.out.println(driver.findElement(By.id("content")).getText());



//}

//}
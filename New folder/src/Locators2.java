
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Locators2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		String name="rahul";
		String password = getPassword(driver);
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	     driver.findElement(By.id("inputUsername")).sendKeys(name);
	     driver.findElement(By.name("inputPassword")).sendKeys(password);
	     driver.findElement(By.className("signInBtn")).click();
	     Thread.sleep(1000);
	     System.out.println(driver.findElement(By.tagName("p")).getText());
	     Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	     Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
         driver.findElement(By.xpath("//*[text()='Log Out']")).click();
         driver.close();
	
	}
 public static String getPassword(WebDriver driver) throws InterruptedException
 
 {
	 driver.get("https://rahulshettyacademy.com/locatorspractice/");
	 driver.findElement(By.linkText("Forgot your password?")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    String passwordText=driver.findElement(By.cssSelector("form p")).getText();
	    //Please use temporary password 'rahulshettyacademy' to Login.
	    String[] passwordArray= passwordText.split("'");
	   // String[] passwordArray2= passwordArray[1].split("'");
	   // passwordArray2[0]
	    String password = passwordArray[1].split("'") [0];
		return password;
	    
	    
	    		
	    
	 
 }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentdynamicselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 WebElement optionSelected = driver.findElement(By.id("checkBoxOption2"));
 optionSelected.click();
 String lable= driver.findElement(By.cssSelector("label[for='benz']")).getText();
 System.out.println(lable);
 WebElement staticDropDown = driver.findElement(By.id("dropdown-class-example"));
 Select dropDown = new Select(staticDropDown);
 dropDown.selectByVisibleText(lable);
 WebElement inputbox = driver.findElement(By.cssSelector("#name"));
 inputbox.sendKeys(lable);
 driver.findElement(By.id("alertbtn")).click();
 System.out.println(driver.switchTo().alert().getText());
 driver.switchTo().alert().accept();
 
 
 //import org.openqa.selenium.By;



 //import org.openqa.selenium.Keys;



 //import org.openqa.selenium.WebDriver;



 //import org.openqa.selenium.WebElement;



 //import org.openqa.selenium.chrome.ChromeDriver;



 //import org.openqa.selenium.support.ui.Select;



 //public class Assignment {



// public static void main(String[] args) {



 // TODO Auto-generated method stub



 //System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

    

        // WebDriver driver = new ChromeDriver();

    

         //driver.get("http://qaclickacademy.com/practice.php");

         //driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        // String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

         //WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

         //Select s=new Select(dropdown);

        // s.selectByVisibleText(opt);

        // driver.findElement(By.name("enter-name")).sendKeys(opt);

        // driver.findElement(By.id("alertbtn")).click();

      //String text=  driver.switchTo().alert().getText();

     // if(text.contains(opt))

     // {

     //System.out.println("Alert message success");

     // }

     // else

    // System.out.println("Something wrong with execution");

 //}

        

        

      //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   
 
 		
 
 
 		
	}

}

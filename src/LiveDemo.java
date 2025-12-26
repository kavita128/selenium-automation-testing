import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

//click on column
driver.findElement(By.xpath("//tr/th[1]")).click();
//driver.findElement(By.xpath("//tr/th[1]")).click();
//capture all WebElements into list
List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

//capture text of all WebElements into new(original)list
List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());

//sort on the original list of step 3 -> sorted List
List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

//compare originalList Vs sortedList
Assert.assertTrue(originalList.equals(sortedList));

//
List<String>price;
do
{
//scan the name column with getText - > Beans-> print the price of the Bean 
	// rice price
	List<WebElement> raws = driver.findElements(By.xpath("//tr/td[1]"));
	
price = raws.stream().filter(s->s.getText().contains("Rice")).
map(s->getPriceVeggie(s)).collect(Collectors.toList());
price.forEach(a->System.out.println(a));
if (price.size()<1)
{
	driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
	}
}while(price.size()<1);


	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}

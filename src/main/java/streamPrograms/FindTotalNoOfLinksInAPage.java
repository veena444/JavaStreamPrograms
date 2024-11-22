package streamPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Print all links of a page using JavaStreams.
 */
public class FindTotalNoOfLinksInAPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		linksList
		   .stream()
		      .filter(e -> !e.getText().isEmpty())
		         .forEach(e -> System.out.println(e.getText()));
		
		driver.quit();

	}

}

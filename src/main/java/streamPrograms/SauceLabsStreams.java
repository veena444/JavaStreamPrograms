package streamPrograms;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabsStreams {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//print all prices
		List<WebElement> prices = driver.findElements(By.cssSelector("div.inventory_item_price"));	
		prices.stream().forEach(e -> System.out.println(e.getText()));
		
		//sort all prices & print max & min price
	List<Double> sortedPrices =	prices
		   .stream()
		       .map(e -> Double.parseDouble (e.getText().substring(1)))
		          .sorted(Comparator.reverseOrder())
		             .collect(Collectors.toList());
	
	System.out.println(sortedPrices);
	System.out.println("Max price:"+sortedPrices.get(0));
	System.out.println("Min price:"+sortedPrices.get(sortedPrices.size()-1));
	
	
	//OR
	double maxPrice = prices.stream().map(e -> Double.parseDouble (e.getText().substring(1))).max(Double :: compareTo).get();
	System.out.println(maxPrice);
	
	double minPrice = prices.stream().map(e -> Double.parseDouble (e.getText().substring(1))).min(Double :: compareTo).get();
	System.out.println(minPrice);
	
		
		//print 1st & last product price
	
	double firstProductPrice = prices
	   .stream()
	      .map(e -> Double.parseDouble(e.getText().substring(1)))
	         .findFirst()
	            .get();
	
	System.out.println("First product price: "+firstProductPrice);
	
	double lastProductPrice = prices
			   .stream()
			      .map(e -> Double.parseDouble(e.getText().substring(1)))
			         .reduce((first, second) -> second)
			            .get();
			
			System.out.println("Last product price: "+lastProductPrice);
	
	driver.quit();

	}

}

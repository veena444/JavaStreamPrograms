package streamPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Streams {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> currentPriceList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		long priceListCount = currentPriceList.stream().count();
		System.out.println(priceListCount);
		
		double maxStockPrice = currentPriceList.stream().map(e -> Double.parseDouble(e.getText())).max(Double :: compareTo).get();
		System.out.println(maxStockPrice);
		
		driver.quit();

	}

}

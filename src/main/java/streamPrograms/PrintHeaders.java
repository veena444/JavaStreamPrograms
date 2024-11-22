package streamPrograms;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeaders {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		//print all headers
		
		By headers = By.cssSelector("section#details h3");
		printHeadersList(headers);
		
		if(getHeadersList(headers).contains("Reports")){
			System.out.println("PASS");
		}
		
		driver.quit();
		

	}
	
	public static List<String> getHeadersList(By locator) {
		List<WebElement> headersList = driver.findElements(locator);
		return headersList.stream().map(e -> e.getText()).collect(Collectors.toList());
		
	}
	
	public static void printHeadersList(By locator) {
		List<WebElement> headersList = driver.findElements(locator);
		headersList.stream().forEach(e -> System.out.println(e.getText()));
	}

}

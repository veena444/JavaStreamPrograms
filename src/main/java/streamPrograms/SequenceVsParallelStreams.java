package streamPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SequenceVsParallelStreams {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		//1.Sequence stream
		
//		long startTime = System.currentTimeMillis();
//		linksList.stream().forEach(e -> System.out.println(e.getText()));
//		long endTime = System.currentTimeMillis();
//		
//		System.out.println("Time taken:"+(endTime-startTime));//11769
		
		//2.Parallel stream
		
		long startTime = System.currentTimeMillis();
		linksList.parallelStream().forEach(e -> System.out.println(e.getText()));
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken:"+(endTime-startTime));//9336
		
		driver.quit();

	}

}

package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\OneDrive\\Desktop\\SeleniumSoftwares\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
}


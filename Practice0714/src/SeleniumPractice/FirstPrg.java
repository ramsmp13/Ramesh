package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPrg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\OneDrive\\Desktop\\SeleniumSoftwares\\chromedriver.exe");	
ChromeDriver driver = new ChromeDriver();
Thread.sleep(5000);

driver.get("https://www.google.com");
Thread.sleep(5000);
driver.manage().window().maximize();
Thread.sleep(5000);
driver.close();

	}

}

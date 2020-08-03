package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\OneDrive\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).clear();
		driver.findElement(By.id("homeval")).sendKeys("300000");
		driver.findElement(By.id("downpayment")).sendKeys("30000");
		driver.findElement(By.id("loanamt")).clear();
		driver.findElement(By.id("loanamt")).sendKeys("200000");
		driver.findElement(By.id("intrstsrate")).sendKeys("3");
		driver.findElement(By.id("loanterm")).sendKeys("24");
		driver.findElement(By.id("pptytax")).sendKeys("3000");
		driver.findElement(By.id("pmi")).sendKeys("0.25");
		driver.findElement(By.id("hoi")).sendKeys("1000");
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
	}

}

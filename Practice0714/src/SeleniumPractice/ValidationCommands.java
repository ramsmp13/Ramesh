/* Author - Ramesh
 * Prg for to verify Validation commands and XPATH locator
 */


package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\OneDrive\\Desktop\\SeleniumSoftwares\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
boolean status = driver.findElement(By.id("b_logo")).isDisplayed();
if(status==true)
{
	System.out.println("BING Image available");
}else 
{
	System.out.println("Image not present");
}
driver.findElement(By.xpath("//*[@id='id_sc']")).click();
System.out.println("clicked on Menu option");
driver.findElement(By.xpath("//*[@id='HBContent']/a[2]/div/div[2]")).click();
Thread.sleep(3000);
driver.findElement(By.id("id_sc")).click();
driver.findElement(By.xpath("//*[@id='HBContent']/a[4]/div")).click();
Thread.sleep(2000);
driver.close();
	}

}

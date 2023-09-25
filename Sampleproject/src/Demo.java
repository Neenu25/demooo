import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	
	public  void setup() {
		
		WebDriver driver = new ChromeDriver();
		
	//	Thread.sleep(6000);
		driver.manage().window().maximize();
		
		//valid inputs	
		driver.get("https://di6mm4n235un2.cloudfront.net/auth/home");
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		//driver.findElement(By.xpath("//div[@class='user-detail']/div/img")).click();
		//driver.findElement(By.xpath("")).click();
		//Thread.sleep(6000);
		driver.quit();
		
		//valid username and invalid password
		driver.get("https://di6mm4n235un2.cloudfront.net/user/dashboard");
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan10@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subh@123");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		//Thread.sleep(6000);
		driver.quit();
		
		
		//invalid username and valid password
		driver.get("https://di6mm4n235un2.cloudfront.net/user/dashboard");
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@123");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		
		driver.quit();
		
		//invalid username and invalid password
		driver.get("https://di6mm4n235un2.cloudfront.net/user/dashboard");
		driver.findElement(By.xpath("//button[@class='submit-button btn-margin']")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[1]/input")).sendKeys("subhaganeshan@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-auth/app-login-screen/div/div/div[2]/div/div/form/div/div[2]/input")).sendKeys("Subha@243");
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();
		
		
		

	}

}

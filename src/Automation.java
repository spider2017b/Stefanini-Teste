import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.os.WindowsUtils;

public class Automation {

	public static void main(String[] args ) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// Create object of HashMap Class
				Map<String, Object> prefs = new HashMap<String, Object>();
				
				//Set the notification setting it will override the default setting
				prefs.put("profile.default_content_setting_values.notifications", 2);
				
				//Create object of ChromeOption class
				ChromeOptions options = new ChromeOptions();
				
				//set the experimental option
				options.setExperimentalOption("prefs", prefs);
				
				System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
				
				WebDriver driver =new ChromeDriver(options);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				WindowsUtils.killByName("excel.exe");
				
				driver.manage().deleteCookieNamed("sessionKey");
				
				driver.get("http://www.aprendendotestar.com.br/treinar-automacao.php");
				File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("C:\\Users\\allan\\Stefanini-Teste\\screenshot.png"));
				
				// This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,1000)");
		        File src1=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src1,new File("C:\\Users\\allan\\Stefanini-Teste\\screenshot2.png"));
				
				driver.findElement(By.xpath("//input[@class='btn btn-info']")).click();
				File src2=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(src2,new File("C:\\Users\\allan\\Stefanini-Teste\\screenshot3.png"));
				driver.findElement(By.xpath("//input[@name='form_usuario']")).sendKeys("John");
				driver.findElement(By.xpath("//input[@name='form_senha']")).sendKeys("");
				driver.findElement(By.xpath("//input[@class='btn btn-info']")).click();
				
				File src3=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src3,new File("C:\\Users\\allan\\Stefanini-Teste\\screenshot4.png"));
				
				driver.findElement(By.xpath("//input[@name='form_usuario']")).sendKeys("John kennedy");
				driver.findElement(By.xpath("//input[@name='form_senha']")).sendKeys("123456");
				driver.findElement(By.xpath("//input[@name='form_nome']")).sendKeys("");
				driver.findElement(By.xpath("//input[@class='btn btn-info']")).click();
				// This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,1000)");
		        File src4=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src4,new File("C:\\Users\\allan\\Stefanini-Teste\\screenshot5.png"));
				
				driver.findElement(By.xpath("//input[@name='form_usuario']")).sendKeys("John_kennedy");
				driver.findElement(By.xpath("//input[@name='form_senha']")).sendKeys("123456");
				driver.findElement(By.xpath("//input[@name='form_nome']")).sendKeys("John Kennedy");
				driver.findElement(By.xpath("//input[@class='btn btn-info']")).click();
				// This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,1000)");
		        File src5=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src5,new File("C:\\Users\\allan\\Stefanini-Teste\\screenshot6.png"));
				
				driver.findElement(By.xpath("//input[@name='form_usuario']")).sendKeys("John_kennedy");
				driver.findElement(By.xpath("//input[@name='form_senha']")).sendKeys("1234567");
				driver.findElement(By.xpath("//input[@name='form_nome']")).sendKeys("Bryan");
				driver.findElement(By.xpath("//input[@class='btn btn-info']")).click();
				// This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,1000)");
		        File src6=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src6,new File("C:\\Users\\allan\\Stefanini-Teste\\screenshot7.png"));
				
				// This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,1000)");
		        driver.findElement(By.xpath("//tr[3]//td[5]//a[1]")).click();
		     
				// This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,1000)");
		        File src7=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src7,new File("C:\\Users\\allan\\Stefanini-Teste\\screenshot8.png"));
		        
		     // This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,1000)");
				driver.findElement(By.xpath("//a[contains(text(),'Clique aqui')]")).click();
				// This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,1000)");
				File src8=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src8,new File("C:\\Users\\allan\\Stefanini-Teste\\screenshot9.png"));
				
		        
				
	}

}

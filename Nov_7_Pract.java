package screenshotPract1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Nov_7_Pract 
{

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts= driver;
		
		File source_loc= ts.getScreenshotAs(OutputType.FILE);
		
		File dest_loc= new File("/Users/kiranshinde/eclipse-workspace/SeleniumMarchAshwini/Screenshot/program.png");
		
		FileHandler.copy(source_loc, dest_loc);
		

	}

}

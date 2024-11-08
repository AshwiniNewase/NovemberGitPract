package practLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator_ID 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///Users/kiranshinde/Downloads/manish.html");
		driver.manage().window().maximize();
		WebElement firstName_textbox=driver.findElement(By.id("firstName"));
		firstName_textbox.sendKeys("Ashwini");
		WebElement lastName_textbox=driver.findElement(By.id("lastName"));
		lastName_textbox.sendKeys("Newase");
		WebElement email_textbox=driver.findElement(By.id("email"));
		email_textbox.sendKeys("ashwininewase@gmail");
		WebElement search_checkbox=driver.findElement(By.id("subscribe"));
		if(search_checkbox.isSelected()){}
		else
		{
			search_checkbox.click();
		}
		//WebElement radiobutton_male=driver.findElement(By.linkText("Male"));
		WebElement radiobutton_female=driver.findElement(By.id("female"));
		radiobutton_female.click();
		WebElement country_dropdown=driver.findElement(By.id("country"));
		Select S1=new Select(country_dropdown);
		//S1.selectByIndex(2);//UK
		S1.selectByVisibleText("Canada");
		//S1.selectByValue("australia");
		WebElement submit_button=driver.findElement(By.xpath("//*[@type='button']"));
		submit_button.click();
		Thread.sleep(2000);
		driver.quit();
	}

}

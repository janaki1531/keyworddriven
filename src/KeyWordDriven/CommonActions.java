package KeyWordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonActions extends BaseUtility {
	
	
	public static void openBrowser (String browser) {
		try{
			if (browser.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\KeywordDrivenByExCEL\\src\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("IE")){
				//code
			}
			else if (browser.equalsIgnoreCase("Gecko")){
				//code
			}			
			else {
				System.out.println("Invalid browser selection");
			}
			
			System.out.println("User selected " + browser + " browser");
			
		}catch (Exception e){
			e.printStackTrace();
		}		
	}
	
	//navigate  url
	public static void navigateUrl () {
		try{
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			System.out.println("User is able to launch maximize");
		}catch (Exception p){
			p.printStackTrace();
			System.out.println("User is not able to launch maximize");
		}
	}
	
	//enter text
	public static void enterText (String xpathValue, String enterValue) {
		try{
			driver.findElement(By.xpath(xpathValue)).sendKeys(enterValue);
			//System.out.println(driver.findElement(By.xpath(xpathValue)).getText());
			
			
			/*WebElement element = driver.findElement(By.xpath(xpathValue));
			element.sendKeys(enterValue);*/
			
			System.out.println("User is able to enter the value " + enterValue);
		}catch (Exception d){
			d.printStackTrace();
			System.out.println("User is not able to enter the value " + enterValue);
		}
	}
	
	//click button
	public static void clickButton (String xpathValue){
		try{
			driver.findElement(By.xpath(xpathValue)).click();
			System.out.println("User is able to click the button");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is not able to click the button");
		}
	}
	
	//select item
	public static void selectItem (String xpathValue, String selectItem) {
		try{
			WebElement element = driver.findElement(By.xpath(xpathValue));
			
			Select sel = new Select (element);
			sel.selectByVisibleText(selectItem);
			
			System.out.println("User is able to select an item " + selectItem);
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is not able to select an item " + selectItem);
		}
	}
	
	//close browser
	public static void closeBrowser (){
		try{
			driver.close();
			driver.quit();
			System.out.println("User is able to close the browser");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is not able to close the browser");
		}
	}
	

}





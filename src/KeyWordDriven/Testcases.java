   package KeyWordDriven;

public class Testcases extends CommonActions {
	public static void main(String[] args) throws Throwable  {
		
		openBrowser("chrome");
		navigateUrl();	
		
		selectItem("//select[@id='searchDropdownBox']", "Amazon Fashion");
		enterText("//input[@id='twotabsearchtextbox']", "camera");
		clickButton("//input[@value='Go']");
		
		Thread.sleep(3000);
		
		closeBrowser();
		
		//finding xpath
		//tagName or *[@propertName='propertyValue']
	}


}

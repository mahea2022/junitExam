package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.NssListPage;
import utility.BrowserFactory;

public class ValidationTest {
	
	WebDriver driver;
	@Test
	public void validationTest() throws InterruptedException {
		driver = BrowserFactory.init();
		
		NssListPage nssListPage = PageFactory.initElements(driver, NssListPage.class);
		nssListPage.addItem();
		NssListPage.checkToggleBox();
		//nssListPage.unCheckToggleBox();
		//nssListPage.checkList1Box();
		nssListPage.removeItems();
		
		
	}

}

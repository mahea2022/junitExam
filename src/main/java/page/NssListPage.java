package page;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NssListPage {
	 WebDriver driver;
	
	public NssListPage(WebDriver driver) {
		this.driver = driver;
		
	}
	@FindBy(how = How.CSS, using = "input[type=text]") WebElement ADD_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value= Add]") WebElement ADD_BUTTON;
	@FindBy(how = How.CSS, using = "input[value=on]")
	
	static WebElement TOGGLE_BOX;
	@FindBy(how = How.CSS, using = "input[type=\"checkbox\"][name=\"todo[1]\"]") WebElement List1_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value=Remove]") WebElement REMOVE_BUTTON;
	
	public void addItem() throws InterruptedException {
		ADD_ELEMENT.sendKeys("abc");
		ADD_BUTTON.click();
		ADD_ELEMENT.sendKeys("jkl123");
		ADD_BUTTON.click();
		ADD_ELEMENT.sendKeys("pqe345");
		ADD_BUTTON.click();
		Thread.sleep(300);;
	}
	 public static void checkToggleBox() {
		 TOGGLE_BOX.click();
		 
		 
	 }
	 //public void unCheckToggleBox() {
		// TOGGLE_BOX.clear();
		// }
	// public  void checkList1Box() {
		// List1_ELEMENT.click();
		 
	// }
	 public  void removeItems() {
		 REMOVE_BUTTON.click();
		
	 
}
	 }

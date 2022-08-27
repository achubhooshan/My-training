package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneraUtilities;

public class HomePage {

	WebDriver driver;
	GeneraUtilities elementObj=new GeneraUtilities();
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath = "//a[@data-toggle='dropdown']")
		WebElement profileName;

		public String displayProfileName() {
			String ele=elementObj.getElementText(profileName);
			System.out.println(ele);
			return ele;
	
		}






	
		
	}


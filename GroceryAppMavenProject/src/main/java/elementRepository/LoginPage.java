package elementRepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;

	public void getusername(String name) {
		userName.sendKeys(name);
		// carol
	}

	public void getpassword(String pswd) {
		password.sendKeys(pswd);
		// "1q2w3e4r"

	}

	public void clickloginButton() {
		// TODO Auto-generated method stub
		loginbutton.click();

	}
	
	public void performLogin() {
        getusername("admin");
        getpassword("admin");
        clickloginButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

}

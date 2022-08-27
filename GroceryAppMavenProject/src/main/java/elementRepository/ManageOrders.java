package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneraUtilities;

public class ManageOrders {

	WebDriver driver;
    GeneraUtilities gu=new GeneraUtilities();

    public ManageOrders(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-order']")
    WebElement managaeorderstab;
    
    
    @FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
    public
    WebElement searchbtn;
    
    @FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
    public
    WebElement resetbtn;

    public void gettab() {
        managaeorderstab.click();
        

    }
    public String fontSearch() {
        managaeorderstab.click();
        String fontsize=gu.PropertyTypeValidation(driver,searchbtn,"font-size");
        return fontsize;

    }
    public String fontRest() {
        managaeorderstab.click();
        String fontsize2=gu.PropertyTypeValidation(driver,resetbtn,"font-size" );
        return fontsize2;

    }
    
    public String backGround_search() {
        managaeorderstab.click();
        String bgcolor=gu.PropertyTypeValidation(driver, searchbtn,"background-color");
        return bgcolor;

    }
    



	
	
	
}

package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneraUtilities {
	
	public String getElementText(WebElement element)
	{
		String text=element.getText();
		return text;
		
	}
    
    public String PropertyTypeValidation(WebDriver driver, WebElement element,String PropertyType)
    {
        return element.getCssValue(PropertyType);
    }


	

}

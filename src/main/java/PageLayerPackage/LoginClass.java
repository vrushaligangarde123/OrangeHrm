package PageLayerPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayerPackage.BaseClass;
import UtilityLayer.WebElementHelper;

public class LoginClass extends BaseClass {
	@FindBy(name="username")
	private WebElement username;
	

	@FindBy(xpath="//button[text()=' Login ' ]")
	private WebElement login;
	
	@FindBy(xpath="//span[text()='Required' ]")
	private WebElement message;
	
	@FindBy(name="password")
	private WebElement password;
	

	
	@FindBy(xpath="//p[text()='Invalid credentials']/parent::div")
	private WebElement warnMessage;
	
	public LoginClass() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void loginFunctionalityUname(String Uname) {
		WebElementHelper.sendKeys(username, Uname);
		
	}
	public void loginFunctionalityPassword(String Pass) {
		WebElementHelper.sendKeys(password, Pass);
		
	}
	public void clicOnkLogin() {
		WebElementHelper.click(login);
	}
	public String  captureWarningMessage() {
		return WebElementHelper.getText(message);
		}
    public String captureInvalidCredentialsWarnMessage() {
    	return WebElementHelper.getText(warnMessage);
    }
}


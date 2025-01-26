package PageLayerPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayerPackage.BaseClass;
import UtilityLayer.WebElementHelper;

public class PimPage extends BaseClass{

	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimLink;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmployee;
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement saveButton;
	
	public PimPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickOnPimLink()
	{
		WebElementHelper.click(pimLink);
	}
	
	public void clickOnAddEmp()
	{
		WebElementHelper.click(addEmployee);
	}
	
	public void addFnameLname(String FirstName, String LastName)
	{
		WebElementHelper.sendKeys(firstName, FirstName);
		WebElementHelper.sendKeys(lastName, LastName);
	}
	
	public void clickOnSave()
	{
		WebElementHelper.click(saveButton);
	}
}

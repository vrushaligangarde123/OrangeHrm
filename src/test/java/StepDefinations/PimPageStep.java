package StepDefinations;

import BaseLayerPackage.BaseClass;
import PageLayerPackage.PimPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PimPageStep extends BaseClass{

	PimPage pim;
	
	@When("user click on PIM link")
	public void user_click_on_pim_link() {
	     pim = new PimPage();
	     pim.clickOnPimLink();
	    
	}
	@When("user click on add employee")
	public void user_click_on_add_employee() {
	   pim.clickOnAddEmp();
	}
	@When("user enter firstName {string} and lastName {string}")
	public void user_enter_first_name_and_last_name(String firstName, String lastName) {
	  
		pim.addFnameLname(firstName, lastName);
	}
	@Then("user click on save button")
	public void user_click_on_save_button() {
	   pim.clickOnSave();
	}
}

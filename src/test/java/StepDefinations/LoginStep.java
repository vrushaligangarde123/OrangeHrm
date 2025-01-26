package StepDefinations;

import org.testng.Assert;

import BaseLayerPackage.BaseClass;
import PageLayerPackage.LoginClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {
	private static LoginClass login;
	@When("user enter  username as {string}")
	public void user_enter_username_as(String username) {
		login = new LoginClass();
		login.loginFunctionalityUname(username);
	}
	

	@Then("click on login button")
	public void click_on_login_button() {
		login.clicOnkLogin();

	}

	@Then("capture warning message")
	public void capture_warning_message() {
		String warnMessage = login.captureWarningMessage();
		Assert.assertEquals(warnMessage, "Required");
	}
	@When("user enter  password as {string}")
	public void user_enter_password_as(String pass) {
	   login.loginFunctionalityPassword(pass);
	}
	@Then("capture warning message as {string}")
	public void capture_warning_message_as(String WarnMessage) {
	    String warningMessage=login.captureInvalidCredentialsWarnMessage();
	    Assert.assertEquals(warningMessage,WarnMessage);
	}

}

package com.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.utils.CommonMethods;
import com.utils.ConfigUtility;
import com.utils.Constants;
import com.utils.ExcelUtility;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends CommonMethods {

//	@Given("I open browser and navigate to SyntaxHRMS #precondition")
//	public void i_open_browser_and_navigate_to_SyntaxHRMS_precondition() {
//	  
//	}

	@When("I enter username")
	public void i_enter_username() {
		sendText(login.userNametextBox, ConfigUtility.getProperty("username"));
	}

	@When("I enter password")
	public void i_enter_password() {
		sendText(login.passwordTextBox, ConfigUtility.getProperty("password"));

	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.btnLogin);
	}

	@Then("I successfully login SyntaxHRMS")
	public void i_successfully_login_SyntaxHRMS() {
		String welcomeText = dash.welcome.getText();
//	    
//	    String username =ConfigUtility.getProperty("username").substring(0, 1).toUpperCase() + ConfigUtility.getProperty("username").substring(1).toLowerCase();
//	    String expText= "Welcome" + username;
//	    Assert.assertEquals(expText, welcomeText);

		boolean doesContains = false;

		if (welcomeText.toLowerCase().contains(ConfigUtility.getProperty("username"))) {
			doesContains = true;
		}
		Assert.assertTrue(doesContains);

	}

	@Given("I enter  {string}")
	public void i_enter(String username) {
		sendText(login.userNametextBox, username);
	}

	@Given("I am enter {string}")
	public void i_am_enter(String password) {
		sendText(login.passwordTextBox, password);

	}

	@Then("I see {string}")
	public void i_see(String errMsg) {
		String actualMsg = login.spanMessage.getText();
		Assert.assertEquals(errMsg, actualMsg);
	}

	@Given("I enter  username and password and I click login button and I see errMsg")
	public void i_enter_and_and_I_click_login_button_and_I_see(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();

		for (Map<String, String> map : data) {
			String usernmae = map.get("username");
			String password = map.get("password");
			String expErrMsg = map.get("errMsg");

			sendText(login.userNametextBox, usernmae);
			sendText(login.passwordTextBox, password);

			click(login.btnLogin);

			String actErrMsg = login.spanMessage.getText();

			Assert.assertEquals(expErrMsg, actErrMsg);
		}
	}

	@Given("I enter  username and password from an excell and I click login button and I see error message on excell file")
	public void i_enter_username_and_password_from_an_excell_and_I_click_login_button_and_I_see_error_message_on_excell_file() {
		List<Map<String, String>> data = ExcelUtility.excelIntoListOfMaps(Constants.TEST_DATA_FILEPATH,
				Constants.NEGATIVE_LOGIN_SHEETNAME);

		for (Map<String, String> map : data) {
			String usernmae = map.get("username");
			String password = map.get("password");
			String expErrMsg = map.get("errMsg");

			System.out.println(expErrMsg);
			
			sendText(login.userNametextBox, usernmae);
			sendText(login.passwordTextBox, password);

			click(login.btnLogin);

			String actErrMsg = login.spanMessage.getText();
			System.out.println(actErrMsg);

			Assert.assertEquals(expErrMsg, actErrMsg);

		}

	}

}

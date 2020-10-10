package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseClass;

public class DashBoardPageWebElements extends BaseClass {
	
	@FindBy(id = "welcome")
	public WebElement welcome;
	
	public DashBoardPageWebElements() {
		PageFactory.initElements(driver, this);
	}
	
}


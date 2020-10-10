package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testBase.BaseClass;

public class NegativeLoginTest extends BaseClass {

	public static void main(String[] args) {

		setUp();

		String[] username = { "admi", "admin", "admin", "" };
		String[] password = { "Hum@nhrm123", "Hum@nhrm12", "", "Hum@nhrm123" };

		for (int i = 0; i < username.length; i++) {
			driver.findElement(By.id("txtUsername")).sendKeys(username[i]);
			driver.findElement(By.id("txtPassword")).sendKeys(password[i]);
			driver.findElement(By.id("btnLogin")).click();
			
			WebElement err = driver.findElement(By.id("spanMessage"));
			
			System.out.println(err.getText());


		}

		

	}

}

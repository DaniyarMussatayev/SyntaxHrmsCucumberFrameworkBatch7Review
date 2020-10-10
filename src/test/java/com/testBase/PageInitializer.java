package com.testBase;

import com.pages.DashBoardPageWebElements;
import com.pages.LoginPageWebElements;

public class PageInitializer extends BaseClass {
	public static LoginPageWebElements login;
	public static DashBoardPageWebElements dash;

	public static void initializePageObjects() {
		login = new LoginPageWebElements();
		dash = new DashBoardPageWebElements();
	}
}

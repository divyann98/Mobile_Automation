package Amazon;


import SetUp.Generic;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Appium_POM.AddToCart;
import Appium_POM.Search_Products;
import Appium_POM.Select_Products;
import Appium_POM.Sign_In;

import SetUp.LoadURL;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

public class Amazon_Run extends LoadURL
{
	AndroidDriver<WebElement> app;

	@Test(priority = 1, description = "Sign In Amazon Account")
	public void sign_in_operation()
	{
		Sign_In signIn = new Sign_In(LoadURL.app);
		signIn.sign();
	}

	@Test(priority = 2, description = " Search The Product")
	public void search() throws IOException {
		Search_Products searchPro = new Search_Products(LoadURL.app);
		searchPro.searching();
	}

	@Test(priority = 3, description="Select The Product")
	public void select()
	{
		Select_Products selectPro = new Select_Products(LoadURL.app);
		selectPro.Selectprod();

	}

	@Test(priority = 4, description="Add Product")
	public void AddToCart()
	{
		AddToCart add = new AddToCart(LoadURL.app);
		add.addcart();
	}

}

package Appium_POM;

import SetUp.Generic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCart 
{


	@FindBy(xpath="//*[@text=\"DONE\"]")
	public static WebElement Done_Cart;

	public AddToCart(AndroidDriver<WebElement> app)
	{
		PageFactory.initElements(app, this);
	}



	public void addcart()
	{
		Generic g=new Generic();
		g.implicitWait(10);

	    g.scrollDown("Add to Cart");

	}

}

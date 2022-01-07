package Appium_POM;

import java.io.IOException;
import java.util.Properties;
import SetUp.Generic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.android.AndroidDriver;

import static org.testng.Assert.*;

public class Search_Products 
{
	@FindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
	public static WebElement SearchBox;

	@FindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
	public static WebElement Searching_Products;

	@FindBy(xpath="//*[@text=\"jacket for women stylish latest\"]")
	public static WebElement Searched;

	public Search_Products(AndroidDriver<WebElement> app)
	{
		PageFactory.initElements(app, this);
	}


	public void searching() throws IOException
	{
		Generic g=new Generic();
	    Properties p= g.propertyFile();
		String search= (String) p.get("SearchItem");

		assertEquals(true, Search_Products.SearchBox.isDisplayed());
		g.explicitWait(ExpectedConditions.visibilityOf(Search_Products.SearchBox),10);
		Search_Products.SearchBox.click();

		assertEquals(true, Search_Products.Searching_Products.isDisplayed());
		g.explicitWait(ExpectedConditions.visibilityOf(Search_Products.Searching_Products),10);
		Search_Products.Searching_Products.sendKeys(search);

		assertEquals(true, Search_Products.Searched.isEnabled());
		g.explicitWait(ExpectedConditions.visibilityOf(Search_Products.Searched),10);
		Search_Products.Searched.click();
	}

}

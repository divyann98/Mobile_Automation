package Appium_POM;


import SetUp.Generic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;

public class Select_Products
{

public Select_Products(AndroidDriver<WebElement> app)
{
	PageFactory.initElements(app, this);
}

public void Selectprod()
{
	Generic g=new Generic();
  g.scrollDown("Sponsored Ad - Stylish Winter Jackets For Women By KLOTTHE®");

}
}

package Appium_POM;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class Sign_In
{
  @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Select English\"]")
  public static WebElement Choosing_language;

  @FindBy(id = "in.amazon.mShop.android.shopping:id/continue_button")
  public static WebElement Continue_in_English;

  @FindBy( id="in.amazon.mShop.android.shopping:id/skip_sign_in_button")
  public static WebElement Skip_SignIn;


  public Sign_In(AndroidDriver<WebElement> app)
  {
	  PageFactory.initElements(app, this);
  }

  
  public void sign()
  {
      Assert.assertEquals(true, Sign_In.Choosing_language.isDisplayed());
      Sign_In.Choosing_language.click();

      Assert.assertEquals(true, Sign_In.Continue_in_English.isDisplayed());

      Sign_In.Continue_in_English.click();

      Assert.assertEquals(true, Sign_In.Skip_SignIn.isDisplayed());
      Sign_In.Skip_SignIn.click();

  }
}

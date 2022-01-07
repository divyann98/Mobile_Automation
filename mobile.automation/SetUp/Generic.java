package SetUp;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Generic extends LoadURL
{

    public void scrollDown(String text)
    {
        app.findElementByAndroidUIAutomator
                        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + text
                                + "\").instance(0))")
                .click();

    }

    public void explicitWait(Function element,int time )
    {

        WebDriverWait wait=new WebDriverWait(app,time);

        wait.until(element);
    }

    public  void implicitWait(int time)
    {
        app.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public Properties propertyFile() throws IOException {
        Properties pf=new Properties();
        FileInputStream f=new FileInputStream("/home/qq379/eclipse-workspace/Mobile_Automation_POM/src/test/java/config.properties");
        pf.load(f);
        return pf;
    }

    public void closeApplication()
    {
        app.close();
        app.quit();
    }


}
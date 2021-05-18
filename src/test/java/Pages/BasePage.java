package Pages;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BasePage {


    public static void setDriver() {


        String browser = SupportMethods.getConfigVal("browser");
        if(browser.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            WebDriverManager.chromedriver().setup();
        }

        Configuration.browserCapabilities = new DesiredCapabilities();
        Configuration.browserCapabilities.setCapability("requireWindowFocus", true);
        Configuration.startMaximized = true;
        clearBrowserCache();


    }


    public static BasePage openPage(String www){
        Selenide.open(www);
        return page(BasePage.class);
    }




}

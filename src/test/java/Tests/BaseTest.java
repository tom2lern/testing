package Tests;

import Pages.BasePage;
import Pages.SupportMethods;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


public abstract class BaseTest {


    public static BasePage base = new BasePage();


    @BeforeClass(description = "Initialization of WebDriver")
    public void init() {
        BasePage.setDriver();
        BasePage.openPage(SupportMethods.getConfigVal("page"));


    }


    @DataProvider
    public Object[][] inputStart() {
        Object[][] arrayObject = SupportMethods.getExcelData(this.getClass().getClassLoader().getResource("Input.xls").getPath(), "test");
        return arrayObject;
    }


}

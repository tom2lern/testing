package Tests;


import org.testng.annotations.Test;

public class test1 extends BaseTest {

    @Test(dataProvider = "inputStart")
    public void fd(
            String www
    ) {
        System.out.println(www);

    }

}

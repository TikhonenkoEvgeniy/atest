import common.Driver;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    protected final WebDriver driver = Driver.getInstance();

    @AfterEach
    public void clear() {
        driver.manage().deleteAllCookies();
        Driver.executeJS("window.sessionStorage.clear()");
    }

}

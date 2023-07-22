package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Driver {
    private static WebDriver webDriver = null;

    public static synchronized WebDriver getInstance() {
        if (webDriver == null) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            webDriver = new ChromeDriver();
        }
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.of(5, ChronoUnit.SECONDS));
        return webDriver;
    }

    public static synchronized void executeJS(String script) {
        JavascriptExecutor executor = (JavascriptExecutor) getInstance();
        executor.executeScript(script);
    }
}

import org.junit.jupiter.api.Test;
import pages.MainPage;

public class TextBoxSuite extends BaseTest {
    MainPage mainPage = new MainPage();

    @Test
    public void test_1() {
        mainPage
                .open()
                .clickBtnElements();
    }
}

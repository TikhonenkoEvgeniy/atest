import elements.CheckBox;
import elements.TextField;
import org.openqa.selenium.By;

public class Main {


    public static void main(String[] args) {
        CheckBox checkbox = new CheckBox(By.id("rere"));
        TextField textField = new TextField(By.id("fdfd"));

        textField
                .waitVisible()
                .click()
                .inputText("");

        checkbox
                .waitVisible()
                .select();
    }
}

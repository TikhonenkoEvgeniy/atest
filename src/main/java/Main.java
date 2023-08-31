import elements.Button;
import elements.CheckBox;
import elements.TextField;
import org.openqa.selenium.By;

public class Main {


    public static void main(String[] args) {
        CheckBox checkbox = new CheckBox(By.id("rere"));
        TextField textField = new TextField(By.id("fdfd"));
        Button btn = new Button(By.id("button"));


        btn
                .waitVisible();

        textField
                .waitVisible()
                .insertText("");

        checkbox
                .waitVisible()
                .select();
    }
}

package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Buttons extends Base {
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    public static WebElement Button;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    public static WebElement ImageButton;



    //method declaration
    public void backgroundImageClick(){Button.click();}
    public void buttonWithImageClick(){ImageButton.click();}



}

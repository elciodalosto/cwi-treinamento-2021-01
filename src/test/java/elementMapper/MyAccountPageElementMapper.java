package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageElementMapper {

    @FindBy(id = "email_create")
    public static WebElement fieldEmailCreateAccount;

    @FindBy(id = "SubmitCreate")
    public WebElement btnSubmitCreateAccount;

    // título da página, para validação adicional se a página é a correta
    @FindBy(className = ".page-heading")
    public WebElement pageHeading;
}

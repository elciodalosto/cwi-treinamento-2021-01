package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {
// ONDE OS ELEMENTOS SÃO MAPEADOS

    @FindBy(className = "login")
    public WebElement login;

//    @FindBy(id = "search_query_top")
    public WebElement search_query_top;

//    @FindBy(name = "submit_search")
    public WebElement submit_search;
}

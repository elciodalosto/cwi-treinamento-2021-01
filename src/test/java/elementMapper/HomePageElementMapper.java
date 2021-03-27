package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {
// ONDE OS ELEMENTOS SÃO MAPEADOS

    @FindBy(className = "login")
    public static WebElement login;

    // quando a busca é feita por id, a chamada do FindBy é opcional pois o driver encontra automaticamente o elemento
//    @FindBy(id = "search_query_top")
    public WebElement search_query_top;

    // quando a busca é feita por name, a chamada do FindBy é opcional pois o driver encontra automaticamente o elemento
//    @FindBy(name = "submit_search")
    public WebElement submit_search;

    @FindBy(css = "#block_top_menu .sf-menu li:nth-child(3) a[title=T-shirts]")
    public WebElement menuTShirts;
}

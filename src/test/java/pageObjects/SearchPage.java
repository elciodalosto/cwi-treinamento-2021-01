package pageObjects;

import elementMapper.SearchPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

// CLASSE ONDE SÃO MAPEADAS AS AÇÕES REALIZÁVEIS NOS OBJETOS DA PÁGINA "SEARCH"(PÁGINA QUE SURGE APÓS A PESQUISA)
public class SearchPage extends SearchPageElementMapper {

    public SearchPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    // retorna/pega o texto do "breadcrumb" da barra de navegação
    public String getTextNavigation_page(){
        return navigation_page.getText();
    }

    // retorna/pega o teto do elemento "lighter"
    public String getTextLighter(){
        return lighter.getText();
    }

    // retorna/pega o texto do elemento "heading-counter"(o contador de resultados)
    public String getTextHeading_counter(){
        return heading_counter.getText();
    }

    // valida se a página atual é mesmo a página "Search"
    public boolean isSearchPage(){
        return getTextNavigation_page().equals("Search");
    }
}

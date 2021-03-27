package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageElementMapper {
 // ONDE OS ELEMENTOS SÃO MAPEADOS

   // Palavra/endereço de navegação, que aparece no breadcrumb(caminho atual do usuário) no site.
    @FindBy(className = "navigation_page")
    public WebElement navigation_page;

    // A palavra pesquisada, que aparece entre aspas em cor cinza, logo após a palavra SEARCH.
    @FindBy(className = "lighter")
    public WebElement lighter;

    // Resultado do Contador de "itens Encontrados" na pesquisa feita pelo usuário
    @FindBy(className = "heading-counter")
    public WebElement heading_counter;

}

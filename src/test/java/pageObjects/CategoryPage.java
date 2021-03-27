package pageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {

    // inicia a página
    public CategoryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    // verifica se realmente é a página T-SHIRTS
    public boolean isPageTShirts(){
        return getAuthenticationPageTShirts().contains("T-SHIRTS");
    }

    // certifica se a página contém o texto que se refere à página de categoria T-SHIRTS
    public String getAuthenticationPageTShirts(){
        return nameCategoryTShirts.getText();
    }

    // clica no botão "More"(que chama a página que contém mais informações sobre o produto)
    public void clickProductAddToProductPage(){
        BasePage.mouseOver((productNameCategory));
        buttonMoreAddToProductPage.click();
    }
    // retorna o nome da categoria do produto
    public String getProductNameCategory(){
        return productNameCategory.getText();
    }
}

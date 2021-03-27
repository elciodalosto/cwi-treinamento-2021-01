package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// MINHA CLASSE DE ESTUDOS
public class ProductPageElementMapper {

        /*// MAPEAMENTO FRACO... VERIFICAR FORMA MAIS CONFIÁVEL DE MAPEAR O PRODUTO
        @FindBy(className = "product-name")
        public WebElement product_name;
*/

        @FindBy(css = "#add_to_cart > button")
        public WebElement buttonAddToCart;

        @FindBy(css = "h1[itemprop=name]")
        public WebElement productNamePDP;

        @FindBy(css = ".button-container a[title='Proceed to checkout']")
        public WebElement buttonModalProceedToCheckout;

}

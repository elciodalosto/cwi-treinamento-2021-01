package pageObjects;

import elementMapper.ProductPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

// CLASSE ONDE SÃO MAPEADAS AS AÇÕES REALIZÁVEIS NOS OBJETOS DA PÁGINA "MORE"(PÁGINA ESPECÍFICA DO PRODUTO)
public class ProductPage extends ProductPageElementMapper {

        public ProductPage(){
            PageFactory.initElements(Browser.getCurrentDriver(), this);
        }

        // retorna o nome do produto que consta na Página de Produto(PDP)
        public String getProductNamePDP(){
            return productNamePDP.getText();
        }

        // clica sobre o botão "Add To Cart"
        public void clickButtonAddToCart(){
            buttonAddToCart.click();
        }

        public void clickButtonModalProceedToCheckout(){
            buttonModalProceedToCheckout.click();
        }
}

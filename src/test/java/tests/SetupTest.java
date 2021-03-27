package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import javax.rmi.CORBA.Util;

import static org.junit.Assert.*;

@Feature("Testes site de e-commerce")

public class SetupTest extends BaseTests {

    @Test
    @Story("Abrir o site")
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver()
                .getCurrentUrl().contains("Teste"));
//                .getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a URL");
    }

    @Test
    @Story("Realizar o login")
    public void testLogin(){

        // Iniciar as páginas
        // instanciando as classes e iniciando elas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        home.clickBtnLogin();
        System.out.println("Clicou em Sign In e direcionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getBaseUrl()
                .concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();
        System.out.println("Preencheu o email");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em Sign In");
        assertTrue(Browser.getCurrentDriver()
                .getCurrentUrl().contains(Utils.getBaseUrl()
                        .concat("index.php?controller=my-account")));
        System.out.println("Validou a URL de minha conta");
        assertTrue(Browser.getCurrentDriver()
                .findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT"));
        System.out.println("Validou Minha Conta no site");

    }

    @Test
    @Story("Realizar o registro de novo Usuário")
    public void testUserRegister(){
        HomePage home = new HomePage();
        MyAccountPage account = new MyAccountPage();
        home.clickBtnLogin();
        account.fillEmailCreateAccountField();
        account.clickBtnCreateAccount();

        // CONTINUAR A MONTAGEM DO MÉTODO...
        // PREENCHER FORMULARIO E REGISTRAR

    }

    @Test
    @Story("Realizar a pesquisa no campo Search")
    public void testSearch(){

        String quest = "DRESS";
        String questResultQtd = "7";

        // iniciar as páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        // fazer a pesquisa
        home.doSearch(quest);

        // validar a pesquisa
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));
    }

    @Test
    @Story("Acessar Categoria")
    public void testAccessCategoryTShirts(){
        // inicia a página
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();

        // clica na categoria T-Shirts
        home.clickCategoryTShirts();

        // a linha abaixo, comentada, é outra forma de fazer o click na categoria T-SHIRTS
//        Browser.getCurrentDriver().findElement(By.linkText("T-SHIRTS")).click();

        // valida se ao clicar em Categoria "T-shirts" ocorre o redirecionamento correto
        assertTrue(category.isPageTShirts());
    }

    @Test
    @Story("Acessar Página de Produto")
    public void testAddProductToProductPage(){
        // acessar a categoria T-Shirts
        testAccessCategoryTShirts();

        // iniciar as páginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();

        // salva o nome do produto na página de categoria
        String nameProductCategory = category.getProductNameCategory();

        // clicar em More e direcionar para a página do produto
        category.clickProductAddToProductPage();

        //verificar se o produto está na página de detalhes do produto correto
        assertTrue(pdp.getProductNamePDP().equals(nameProductCategory));
    }

    @Test
    @Story("Adicionar Produto ao Carrinho")
    public void testAddProductToCartPage(){

        // acessa a página do produto
        testAddProductToProductPage();

        // inicia as páginas
        ProductPage pdp = new ProductPage();
        CartPage cart = new CartPage();

        // salva o nome do produto na página de PDP
        String nameProductPDP = pdp.getProductNamePDP();

        // clica no botão de "adicionar ao carrinho"
        pdp.clickButtonAddToCart();

        // clica no botão "Proceed to Checkout"
        pdp.clickButtonModalProceedToCheckout();

        assertTrue(cart.getNameProductCart().equals(nameProductPDP));
    }

}

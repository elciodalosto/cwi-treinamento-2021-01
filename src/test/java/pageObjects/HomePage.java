package pageObjects;

import elementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

// CLASSE ONDE SÃO MAPEADAS AS AÇÕES REALIZÁVEIS NOS OBJETOS DA PÁGINA "HOME"
public class HomePage extends HomePageElementMapper {

    //
    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }


    // clica no botão de "Login"(SignIn)
    @Step("Clicar no botão Login")
    public static void clickBtnLogin(){
        login.click();
    }

    // clica no campo "Search"
    @Step("Clicar sobre campo de pesquisa para ativá-lo")
    public void clickSearch_query_top(){
        search_query_top.click();
    }

    // Insere um texto no campo de pesquisa "Search"
    @Step(" preenche o campo de pesquisa com dados")
    public void sendKeysSearch_query_top(String keys){
        search_query_top.sendKeys(keys);
    }

    // realiza uma pesquisa(passando um argumento) no campo "Search"
    public void doSearch(String quest){
        clickSearch_query_top();
        sendKeysSearch_query_top(quest);
        clickSubmit_search();
    }
    // envia a pesquisa do campo "Search"
    public void clickSubmit_search(){
        submit_search.click();
    }

    // clica na categoria T-Shirts
    public void clickCategoryTShirts() {
        menuTShirts.click();
    }
}

package pageObjects;

import elementMapper.MyAccountPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

// CLASSE ONDE SÃO MAPEADAS AS AÇÕES REALIZÁVEIS NOS OBJETOS DA PÁGINA "MY ACCOUNT" (APÓS AUTENTICAÇÃO)
public class MyAccountPage extends MyAccountPageElementMapper {

    // inicia a página
    public MyAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
        System.out.println("montou a página Minha Conta");
    }


    // preenche o campo de e-mail do módulo de Registro de novo usuário
    public static void fillEmailCreateAccountField(){
        fieldEmailCreateAccount.click();
        fieldEmailCreateAccount.sendKeys("testador@testador.com");
        System.out.println("inseriu o e-mail testador@testador.com");
    }

    public void clickBtnCreateAccount(){
    //variável do botão: submitCreate
        btnSubmitCreateAccount.click();
    }


}

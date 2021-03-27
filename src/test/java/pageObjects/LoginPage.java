package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

// CLASSE ONDE SÃO MAPEADAS AS AÇÕES REALIZÁVEIS NOS OBJETOS DA PÁGINA DE "LOGIN"(SignIn)
public class LoginPage extends LoginPageElementMapper {

    // inicia a página
    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    // preenche o campo "email"
    @Step("Preenche o e-mail")
    public void fillEmail(){
//        Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("edalosto@gmail.com");
        email.sendKeys("edalosto@gmail.com");
    }

    // preenche o campo "passwd"
    @Step("Preenche a senha")
    public void fillPasswd(){
//    Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("fakepass");
        passwd.sendKeys("fakepass");
    }

    // clica no botão de envio(submit) do formulário de Login
    @Step("Clica em SignIn")
    public void clickBtnSubmitLogin(){
//        Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        SubmitLogin.click();
    }

}

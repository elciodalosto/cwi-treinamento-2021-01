package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail(){
//        Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("edalosto@gmail.com");
        email.sendKeys("edalosto@gmail.com");
    }

    public void fillPasswd(){
//    Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("fakepass");
        passwd.sendKeys("fakepass");
    }

    public void clickBtnSubmitLogin(){
//        Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
        SubmitLogin.click();
    }

}

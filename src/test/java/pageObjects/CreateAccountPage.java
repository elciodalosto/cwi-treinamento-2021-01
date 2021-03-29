package pageObjects;

import elementMapper.CreateAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAccountPage extends CreateAccountPageElementMapper {

    public CreateAccountPage () {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }


    // retornar o nome da página AUTHENTICATION
    public String getAuthenticationPageName(){
        return subHeadingAuthentication.getText();
    }
    // Verificar se o nome da página contém o argumento passado no teste
    public boolean isAuthenticationPage(String name){
         return getAuthenticationPageName().contains(name);
    }


    // retornar o nome da página CREATE AN ACCOUNT
    public String getCreateAccountPageName(){
        return subHeadingPersonalInformation.getText();
    }
    // Verificar se o nome da página contém o argumento passado no teste
    public boolean isCreateAccountPage(String name){
         return getCreateAccountPageName().contains(name);
    }

    // Preencher o campo "email"
    public void fillEmailCreate(){
        emailCreate.sendKeys("fakemail@fakemail.com");
    }

    // Clicar no botão "Create an account"
    public void clickBtnCreateAccount(){
        submitCreate.click();
    }


    /* MÉTODOS PARA O FORMULÁRIO DE CADASTRO */


    // clicar no botão de seleção de Gênero
    public void clickRadioBtn(int gender){
        if(gender == 1) {
            radioBtnMasc.click();
        }
        else if(gender == 2){
            radioBtnFem.click();
        }
    }


    // Preencher o Primeiro Nome
    public void fillFirstName(){
        firstName.sendKeys("Feikerson");
    }

    // Preencher o Sobrenome
    public void fillLastName(){
        lastName.sendKeys("Fake Person Junior");
    }

    // Preencher a senha (Regra: 5 caracteres, no mínimo)
    public void fillPasswd(){
        passwd.sendKeys("fakepass");
    }

    public void fillBirthDate(){
        days.click();
        daysOption.click();
        months.click();
        monthsOption.click();
        years.click();
        yearsOption.click();
    }

    public void checkReceiveNewsletter(){
        receiveNewsletter.click();
    }
    public void checkReceiveOffers(){
        receiveOffers.click();
    }

    public void fillFirstNameForAddress(){
        firstNameForAddress.sendKeys("Feikerson");
    }
    public void fillLastNameForAddress(){
        lastNameForAddress.sendKeys("FakePerson");
    }
    public void fillCompanyName(){
        companyForAddress.sendKeys("Organizações X S.A");
    }
    public void fillAddress(){
        address1.sendKeys("Endereço Fake X1");
        address2.sendKeys("Endereço Fake Y1");
    }

    public void fillCity(){
        city.sendKeys("Cidade Fake");
    }
    public void fillState(){
        state.click();
        stateOption.click();
    }
    public void fillPostalCode(){
        postalCode.sendKeys("12345");
    }
    public void fillCountry(){
        country.click();
        countryOption.click();
    }
    public void fillAdditionalInfo(){
        additionalInformation.sendKeys("Preenchimento de informações adicionais para fim de testes no campo area de texto do formulário");
    }
    public void fillHomePhone() {
        homePhone.sendKeys("123456789");
    }
    public void fillMobilePhone() {
        mobilePhone.sendKeys("987654321");
    }

    public void fillAliasForAddress(){
        aliasForAddress.sendKeys("Endereço Fake");
    }

    public void submitAccount(){
        btnSubmitAccount.click();
    }
    public void fillCreateAccountForm(){
        clickRadioBtn(1); // Para testes, 1=Masc, 2=Fem
        fillFirstName();
        fillLastName();
        fillPasswd();
        fillBirthDate();
        checkReceiveNewsletter();
        checkReceiveOffers();
        fillFirstNameForAddress();
        fillLastNameForAddress();
        fillCompanyName();
        fillAddress();
        fillCity();
        fillState();
        fillPostalCode();
        fillCountry();
        fillAdditionalInfo();
        fillHomePhone();
        fillMobilePhone();
        fillAliasForAddress();
        submitAccount();
    }


}

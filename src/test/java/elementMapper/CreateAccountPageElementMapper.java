package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPageElementMapper {

    // página AUTHENTICATION
    @FindBy(className = "page-heading")
    public static WebElement subHeadingAuthentication;

    // campo "email address"
    @FindBy(id = "email_create")
    public static WebElement emailCreate;

    // botão "Create an account"
    @FindBy(id = "SubmitCreate")
    public static WebElement submitCreate;

    // FORMULÁRIO PARA CADASTRO - 'INFORMAÇÕES PESSOAIS'

    // Botão rádio, gênero Masculino
    @FindBy(id = "id_gender1")
    public static WebElement radioBtnMasc;

    // Botão rádio, gênero Feminino
    @FindBy(id = "id_gender2")
    public static WebElement radioBtnFem;

    // Campo Primeiro Nome do formulário de Informações Pessoais
    @FindBy(id = "customer_firstname")
    public static WebElement firstName;

    // Campo Sobrenome do formulário de Informações Pessoais
    @FindBy(id = "customer_lastname")
    public static WebElement lastName;

    // Campo de Senha do formulário de Informações Pessoais
    @FindBy(id = "passwd")
    public WebElement passwd;

    /* PÁGINA DO FORMULÁRIO DE CRIAÇÃO DE CONTA */
    @FindBy(css = "#account-creation_form > div:nth-child(1) > h3")
    public WebElement subHeadingPersonalInformation;


    /* CAMPOS DATA DE NASCIMENTO do formulário de Informações Pessoais */
    // Dia
    @FindBy(css = "#days.form-control")
    public WebElement days;
    @FindBy(css = "#days > option:nth-child(25)") // dia=25
    public WebElement daysOption;
    // Mês
    @FindBy(css = "#months.form-control")
    public WebElement months;
    @FindBy(css = "#months > option:nth-child(3)") // mês=Fevereiro
    public WebElement monthsOption;
    // Ano
    @FindBy(css = "#years.form-control")
    public WebElement years;
    @FindBy(css = "#years > option:nth-child(36)") // ano=1987
    public WebElement yearsOption;

    // Caixa de marcação: "Newsletter" do formulário de Informações Pessoais
    @FindBy(id = "newsletter")
    public WebElement receiveNewsletter;

    // Caixa de marcação: "Receber Ofertas Especiais" do formulário de Informações Pessoais
    @FindBy(id = "optin")
    public WebElement receiveOffers;


    /* FORMULÁRIO PARA CADASTRO - 'SEU ENDEREÇO' */

    // Campo Nome do formulário de Endereço
    @FindBy(css = ".account_creation #firstname")
    public WebElement firstNameForAddress;

    // Campo Sobrenome do formulário de Endereço
    @FindBy(css = ".account_creation #lastname")
    public WebElement lastNameForAddress;

    // Campo Companhia do formulário de Endereço
    @FindBy(css = ".account_creation #company")
    public WebElement companyForAddress;

    // Campo Endereço do formulário de Endereço (obrigatório)
    @FindBy(id = "address1")
    public WebElement address1;

    // Campo Endereço do formulário de Endereço (opcional)
    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "city")
    public WebElement city;

    // Campo de Seleção de Estado do formulário de Endereço
    @FindBy(id = "id_state") // selecionar qualquer Estado, ex: opção 1 = Alabama
    public WebElement state;
    @FindBy(css = "#id_state > option:nth-child(13)") // selecionar qualquer Estado, ex: opção 1 = Alabama
    public WebElement stateOption;

    // Campo Zip/CEP/Código Postal, do formulário de Endereço
    @FindBy(id = "postcode")
    public WebElement postalCode;

    // Campo de Seleção de Estado do formulário de Endereço
    @FindBy(id = "id_country")
    public WebElement country;
    @FindBy(css = "#id_country > option:nth-child(2)")
    public WebElement countryOption;

    // Campo Área de Texto para Informações Adicionais do formulário de Endereço
    @FindBy(id = "other")
    public WebElement additionalInformation;

    // Campo Telefone Residencial do formulário de Endereço
    @FindBy(id = "phone")
    public WebElement homePhone;

    // Campo Telefone Móvel do formulário de Endereço
    @FindBy(id = "phone_mobile")
    public WebElement mobilePhone; // selecionar opção 21 = United States

    // Campo Título/Apelido para o Endereço (ex: minha casa, loja, consultório, escritório etc)
    //(Campo obrigatório)
    @FindBy(id = "alias")
    public WebElement aliasForAddress;

    @FindBy(id = "submitAccount")
    public WebElement btnSubmitAccount;






}

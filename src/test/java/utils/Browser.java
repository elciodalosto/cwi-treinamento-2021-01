package utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Browser {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getCurrentDriver(){
        if(driver == null){
            try {
                // a variável "capability" é a variavel que recebe as opções com as quais o Chrome será instanciado
                ChromeOptions capability = new ChromeOptions();

                // o driver propriamente dito
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

                // tempo de espera para "quebrar" o teste, neste caso, 30 segundos
                wait = new WebDriverWait(driver, 30);

                // maximiza o browser
                driver.manage().window().maximize();

                // tempo de espera para evitar que o teste passe e acuse falha antes do elemento testado ser totalmente carregado
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                // tempo de espera até finalizar a página
                driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    // fecha o driver e atribui valor nulo à veriável "driver"
    public static void close(){
        getCurrentDriver().quit();
        driver = null;
    }

    // carrega uma página no navegador através do driver
    public static void loadPage(String url) {
        getCurrentDriver().get(url);
    }

    public static void print(){
        byte[] screenShotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        InputStream screenShotStream = new ByteArrayInputStream(screenShotBytes);
        Allure.addAttachment("screenShot Test: ", screenShotStream);
    }
}

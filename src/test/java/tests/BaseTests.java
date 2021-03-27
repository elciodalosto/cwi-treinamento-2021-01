package tests;

import org.junit.After;
import org.junit.Before;
import utils.Browser;
import utils.Utils;

public class BaseTests {

    // roda o método "setup" ao início do teste
    @Before
    public void setup(){
        Browser.loadPage(Utils.getBaseUrl());
    }

    // fecha o navegador ao fim do teste
    @After
    public void tearDown(){
        Browser.print();
        Browser.close();
    }

}

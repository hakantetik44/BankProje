package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.junit.After;

import org.junit.Ignore;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //hOOKS biz hooksu screenschot almak iixn kulaniriz.
    //Frameworkumujzde hooks failed olanlrin screen shor ini almak icin kullaniliyor
    //Before metdounda sayufa ile hazirlik yapamayiz. Cunku cucumber package duzeyinde calisiyor.
    //Ama TESTNG de class duszetinde calisyorudu doalyisiyla @before method koyarak hazirlik yapmka mantikliydi.
    //Burada before method koymak ise yaramaz.
    @Before
    public void setUp() {
    }

    //Cucumberda normlade test fail olursa sonraki testler calismaz execution direkt durur.
    //Sayfa kapatmada yoktu. Hooks ile Eger sayfa fail verirse screenhot alacak. ve sayfayi dda kapatacak.
    //diger bir husus SeleniumGrid run edecegimiz zaman HOOKS kapatilmali.


    @After

    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }

        Driver.closeDriver();
    }
}



package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class gmiBankPage {



    public gmiBankPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
}

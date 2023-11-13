package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;


public class HomePage {

    private By Teknokta = By.cssSelector("#menuzord > ul.pull-right.flip > li > a");
    private ElementHelper elementHelper;
    public HomePage(WebDriver driver) {
        elementHelper = new ElementHelper(driver);
    }
    public void userOnTheHomePage(){
        elementHelper.openUrl("https:www.trakya.edu.tr");
    }

    public void userClick(){
        elementHelper.click(Teknokta);


    }




}

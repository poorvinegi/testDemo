package test;

import functionLibraries.CommonFunctions;
import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FavouriteTest extends CommonFunctions {
    @Before
    public void beforeTest(){
        openBrowser();
    }

    @Test
    public void verifyFavouritesWithNoProduct(){

        WebElement closePopUp= driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"));
        wait(closePopUp);
        closePopUp.click();


    }
    @Test
    public void verifyFavouritesWithProduct(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"))));
        driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']/button")).click();
        WebElement element= driver.findElement(By.xpath("//*[@id=\"header-big-screen-search-box\"]"));
        element.click();

        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"meganav-link-1\"]/div"))));
        //Actions actions = new Actions(driver);
        //WebElement menMenu = driver.findElement(By.xpath("//*[@id=\"meganav-link-1\"]/div"));
        //actions.moveToElement(menMenu).build().perform();
        Actions a=new Actions(driver);
//        a.moveToElement(element).click().keyDown("ShiftLeft").sendKeys("hello").build().perform();
          //  a.moveToElement(element).sendKeys("hello").build().perform();
        a.keyDown(element,Keys.SHIFT).sendKeys("hello").build().perform();
    }


    @After
    public void afterTest(){
        closeBrowser();
    }
}

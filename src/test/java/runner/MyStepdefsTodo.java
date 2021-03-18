package runner;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepdefsTodo {
    private AppiumDriver driver;

    @Given("yo tengo abierto mi aplicacion todo")
    public void yoTengoAbiertoMiAplicacionTodo() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","testqa");
        capabilities.setCapability("platformVersion","7");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");
        capabilities.setCapability("platformName","Android");

        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //implicit
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("yo hago click en el boton {string}")
    public void yoHagoClickEnElBoton(String nombreControl) {
       switch (nombreControl) {
            case "add":
                driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
                break;
            case "done":
                driver.findElement(By.id("com.vrproductiveapps.whendo:id/note_item_reminder_date1")).click();
                break;
        }

    }


    @And("yo lleno la caja de texto {} con el valor {string}")
    public void yoLlenoLaCajaDeTextoTituloConElValor(String control,String value) {
        switch (control) {
            case "titulo":
                driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys(value);
                break;
            case "nota":
                driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys(value);

                break;

        }

    }

    @Then("la nota {string} deberia ser mostrado")
    public void laNotaDeberiaSerMostrado(String expectedResult) {
        WebElement message = driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
        Assert.assertEquals("Es correcto",expectedResult,message.getText());
    }
}

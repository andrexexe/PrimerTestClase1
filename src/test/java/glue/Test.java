package glue;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


    private static ChromeDriver driver;
    @Given("^Un usuario que se encuentra en la pagina de inicio$")
    public void un_usuario_que_se_encuentra_en_la_pagina_de_inicio() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/java/resource/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
    }

    @When("^Hace Clic sobre comic$")
    public void hace_Clic_sobre_comic() throws Throwable {

    }



    @Then("^me debe mostrar la ventana comics$")
    public void me_debe_mostrar_la_ventana_comics() throws Throwable {

    }

}

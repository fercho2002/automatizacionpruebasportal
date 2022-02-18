package pom.Boletas;

import gherkin.lexer.He;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class AnularBoletaPage extends BasePage {
    public AnularBoletaPage(WebDriver driver){
        super(driver);
    }
    private String url ="http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/consultar-boletas-pago2";
    private By HerramientaUsuarios = By.xpath("//span[contains(.,'Herramientas')]");
    private By fechaCreacionDesde = By.xpath("//div[@class='caption']/div[@class='row ']/div[1]//input[@class='field axa-date-input form-control']");
    private By fechaCreacionHasta = By.xpath("//div[@class='caption']//div[2]//input[@class='field axa-date-input form-control']");
    private By estadoBoleta = By.xpath("//div[@class='caption']/div[@class='row ']/div[3]//select[@class='form-control']");
    private By botonBuscar = By.xpath("//button[@class='btn btn-axa btn-blue btn-secondary']");
    private By selectorAnular = By.xpath("//tbody[1]/tr[1]//button[@class='btn btn-secondary dropdown-toggle']");
    private By botonSiConfirmar = By.xpath("//button[@id='confirmBtn']");
    private By botonAceptar = By.xpath("//button[@id='closeBtn']");
    private By botonAn = By.xpath("//div[@class='dropdown-menu show']/button[contains(.,'Anular')]");
    //inician los metodos//
    public void clickHerramientas()throws Exception{
        click(HerramientaUsuarios);
        Thread.sleep(2000);
    }
    public void cambiarUrl()throws Exception{
        visit(url);
        Thread.sleep(5000);
        validateIframe();
        Thread.sleep(1000);
    }
    public void fechaDesde(String fechaDesde)throws Exception{
        click(fechaCreacionDesde);
        Thread.sleep(1000);
        input(fechaDesde,fechaCreacionDesde);
        Thread.sleep(2000);
    }
    public void fechaHasta(String fechaHasta)throws Exception{
        click(fechaCreacionHasta);
        Thread.sleep(1000);
        input(fechaHasta,fechaCreacionHasta);
        Thread.sleep(2000);
    }
    public void estado(String estado)throws Exception{
        selectElement(estado,estadoBoleta);
        Thread.sleep(1000);
    }
    public void buscar()throws Exception{
        click(botonBuscar);
        Thread.sleep(6000);
    }
    public void cambiarEstado (String estado) throws Exception{
        validateBody();
        Thread.sleep(1000);
        scrollDownManual(600);
        validateIframe();
        Thread.sleep(5000);
        click(selectorAnular);
        Thread.sleep(6000);
        click(botonAn);
    }
    public void clickSi()throws Exception{
        validateBody();
        Thread.sleep(1000);
        scrollUpManual();
        validateIframe();
        Thread.sleep(1000);
        click(botonSiConfirmar);
        Thread.sleep(2000);
    }
    public void aceptar()throws Exception{
        click(botonAceptar);
        Thread.sleep(5000);
        validateBody();
    }
}

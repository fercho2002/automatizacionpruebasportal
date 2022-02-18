package pom.Reporte_Cartera;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class ConsultarCartera extends BasePage {
    public ConsultarCartera(WebDriver driver){
        super(driver);
    }

    private String url ="http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/consultar-estado-cartera2";
    private String urlCarteraPendiente ="http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/detalle-cartera-pendiente2";
    private By HerramientaUsuarios = By.xpath("//span[contains(.,'Herramientas')]");
    private By estadoDeCartera =  By.xpath("//div[@class='caption']//div[@class='col-md-6  ']//select[@class='form-control']");
    private By fechaDeCartera = By.xpath("//input[@class='field axa-date-input form-control']");
    private By claveDeRed = By.xpath("//div[@class='caption']/div[@class='row ']/div[1]//select[@class='form-control']");
    private By codigoDePunto = By.xpath("//div[@class='caption']/div[@class='row ']/div[2]//select[@class='form-control']");
    private By botonBuscar = By.xpath("//button[@class='btn btn-axa btn-blue btn-secondary']");
    private By labelDescargar = By.xpath("//tbody[1]/tr[1]//a[.='Descargar Detalle']");
    private By fechaCarteraPendiente = By.xpath("//input[@class='field axa-date-input form-control']");
    private By botonCarteraPendiente = By.xpath("//button[@class='btn btn-axa btn-blue btn-secondary']");
    //inician los metodos//
    public void AbrirHerramientas()throws Exception{
        click(HerramientaUsuarios);
        Thread.sleep(2000);
    }
    public void cambiarUrl()throws Exception{
        visit(url);
        Thread.sleep(10000);

    }
    public void cambiarUrlCarteraPendiente()throws Exception{
        visit(urlCarteraPendiente);
        Thread.sleep(10000);
    }
    public void estado(String estadoCartera)throws Exception{
        validateIframe();
        Thread.sleep(10000);
        selectElement(estadoCartera,estadoDeCartera);
    }
    public void fecha(String Fecha)throws Exception{
        click(fechaDeCartera);
        input(Fecha,fechaDeCartera);
        Thread.sleep(2000);
        click(fechaDeCartera);
    }
    public void fechaCarteraPendiente(String fecha)throws Exception{
        validateIframe();
        click(fechaCarteraPendiente);
        input(fecha,fechaCarteraPendiente);
        Thread.sleep(2000);
        click(fechaCarteraPendiente);
    }
    public void claveRed(String clave)throws Exception{
        Thread.sleep(3000);
        selectElement(clave,claveDeRed);
    }
    public void codigoPunto(String codigo)throws Exception{
        Thread.sleep(3000);
        selectElement(codigo,codigoDePunto);
    }
    public void buscar()throws Exception{
        Thread.sleep(3000);
        click(botonBuscar);
        validateBody();
        scrollDownManual(400);
        Thread.sleep(10000);
        validateIframe();
    }
    public void descargar()throws Exception{
        click(labelDescargar);
        Thread.sleep(30000);
        validateBody();
    }
    public void descargarCarteraPendiente()throws Exception{
        click(botonCarteraPendiente);
        Thread.sleep(50000);
        validateBody();
    }
}

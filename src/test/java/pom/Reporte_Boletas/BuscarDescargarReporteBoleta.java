package pom.Reporte_Boletas;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

import java.util.TreeMap;

public class BuscarDescargarReporteBoleta extends BasePage {
    public BuscarDescargarReporteBoleta (WebDriver driver){
        super(driver);
    }
    private String url = "http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/reporte-boletas-de-pago2";
    private By HerramientaUsuarios = By.xpath("//span[contains(.,'Herramientas')]");
    private By fechaDeste = By.xpath("//div[@class='caption']/div[@class='row ']/div[1]//input[@class='field axa-date-input form-control']");
    private By fechaHasta = By.xpath("//div[@class='caption']//div[2]//input[@class='field axa-date-input form-control']");
    private By estadoDeBoleta = By.xpath("//div[@class='caption']/div[@class='row ']/div[3]//select[@class='form-control']");
    private By botonBuscar = By.xpath("//button[@class='btn btn-axa btn-blue btn-secondary']");
    private By botonDescargar = By.xpath("//tbody[1]/tr[1]//a[contains(.,'Descargar')]");
    // empiezan los metodos //

    public void Herramientas() throws Exception{
        Thread.sleep(3000);
        click(HerramientaUsuarios);
    }
    public void cambiarUrl()throws Exception{
        Thread.sleep(3000);
        visit(url);
        Thread.sleep(6000);
        validateIframe();

    }
    public void fecha_desde(String fecha)throws Exception{

        Thread.sleep(3000);
        click(fechaDeste);
        Thread.sleep(1000);
        input(fecha,fechaDeste);
    }
    public void fecha_hasta(String fecha)throws Exception{
        Thread.sleep(3000);
        click(fechaHasta);
        Thread.sleep(1000);
        input(fecha,fechaHasta);
    }
    public void estado(String estadoBoleta) throws Exception{
        Thread.sleep(1000);
        selectElement(estadoBoleta,estadoDeBoleta);
    }
    public void buscar() throws Exception{
        Thread.sleep(1000);
        click(botonBuscar);
        Thread.sleep(10000);
        validateBody();
        scrollDownManual(400);
        validateIframe();
        Thread.sleep(3000);
    }

    public void descargar()throws Exception{
        Thread.sleep(3000);
        click(botonDescargar);
        Thread.sleep(10000);
        validateBody();
        Thread.sleep(5000);
        scrollUpManual();
        Thread.sleep(4000);
        validateIframe();
    }


}

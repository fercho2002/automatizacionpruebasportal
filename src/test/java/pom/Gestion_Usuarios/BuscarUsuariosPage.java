package pom.Gestion_Usuarios;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class BuscarUsuariosPage extends BasePage {
    public BuscarUsuariosPage(WebDriver driver){
        super(driver);
    }

    private String url ="http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/gestion-de-usuarios2";
    private By HerramientaUsuarios = By.xpath("//span[contains(.,'Herramientas')]");
    private By nombre = By.xpath("//div[@class='caption']/div[@class='row ']/div[1]//input[@class='field form-control']");
    private By estado = By.xpath("//div[@class='caption']/div[1]//select[@class='form-control']");
    private By botonBusca = By.xpath("//button[contains(.,'Buscar')]");
    private By botonGuardar = By.xpath("//button[contains(.,'Guardar')]");
    private By claveDeRed = By.xpath("//div[@class='caption']/div[@class='row ']/div[1]//select[@class='form-control']");
    private By codigoPuntoVenta = By.xpath("//div[@class='caption']/div[2]/div[2]//select[@class='form-control']");
    private By estadoPrimerUsuario = By.xpath("//tbody[1]/tr[1]//select[@class='form-control w-100']");
    private By botonSiConfirmar = By.xpath("//button[@id='confirmBtn']");
    private By seleccionarTodos = By.xpath("//th[@class='vertical-middle w-25 sorting_disabled']//input[1]");
    public void AbrirHerramientras() throws Exception {
        click(HerramientaUsuarios);
        Thread.sleep(2000);
    }
    public void CambiarUrl() throws Exception {
        visit(url);
        Thread.sleep(1000);
        validateIframe();
        Thread.sleep(1000);
    }
    public void botonBuscar() throws Exception{
        Thread.sleep(3000);
        click(botonBusca);
        Thread.sleep(10000);
        validateBody();
        scrollDownManual(400);
        Thread.sleep(2000);
        validateIframe();
    }

    public void estado(String estadoUsuario)throws Exception{
        Thread.sleep(3000);
        selectElement(estadoUsuario,estado);
    }
    public void claveRed(String clave) throws Exception{
        Thread.sleep(3000);
        selectElement(clave,claveDeRed);
    }
    public void codigo(String codigoPunto)throws Exception{
        Thread.sleep(3000);
        selectElement(codigoPunto,codigoPuntoVenta);
    }
    public void seleccionarEstado(String estado)throws Exception{
        Thread.sleep(3000);
        selectElement(estado,estadoPrimerUsuario);
    }
    public void guardar()throws Exception{
        Thread.sleep(3000);
        click(botonGuardar);
    }
    public void confirmar()throws Exception{
        validateBody();
        scrollUpManual();
        Thread.sleep(3000);
        validateIframe();
        click(botonSiConfirmar);
        Thread.sleep(3000);
    }
    public void seleccionarsi()throws Exception{
        //Thread.sleep(3000);
        //validateBody();
        //scrollDownManual(200);
        //Thread.sleep(1000);
        //validateIframe();
        Thread.sleep(1000);
        click(seleccionarTodos);
        Thread.sleep(3000);


    }

}

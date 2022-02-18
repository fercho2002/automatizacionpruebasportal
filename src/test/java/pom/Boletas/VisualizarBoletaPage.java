package pom.Boletas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class VisualizarBoletaPage extends BasePage {
    public VisualizarBoletaPage(WebDriver driver) {
        super(driver);
    }
    private String Url ="http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/consultar-boletas-pago2";
    private By MenuPrincipal = By.xpath("//span[contains(.,'Herramientas')]");
    private By consultarBoletaPago = By.xpath("//li[@class='dropdown open']//a[.='Consulta boletas de pago']");


    //opciones//
    private By Fecha1=By.xpath("//*[@id=\"_QueryPaymentInvoicesPortlet_INSTANCE_6TZEvMqjBAOd_FechaInicio\"]");
    private By Fecha2=By.xpath("//*[@id=\"_QueryPaymentInvoicesPortlet_INSTANCE_6TZEvMqjBAOd_FechaFin\"]");
    private By Boton=By.xpath("//button[@class='btn btn-axa btn-blue btn-secondary']");
    private By Acciones=By.xpath("//tr[2]//span[@class='lfr-icon-menu-text']");
    private By VER=By.xpath("//div[@class='dropdown-menu show']/a[contains(.,'Ver')]");

    public void CambiarUrlMenu() throws Exception {
        click(MenuPrincipal);
        Thread.sleep(1000);
        click(consultarBoletaPago);
        Thread.sleep(2000);
        openNewTab(Url);
    }
    public void fechaINICIO(String fecha_inicio)throws Exception{
        validateIframe();
        Thread.sleep(3000);
        input(fecha_inicio,Fecha1);
    }
    public void FechaFINAL(String fecha_final)throws Exception{
        Thread.sleep(3000);
        input(fecha_final,Fecha2);
    }
    public void Boton()throws Exception{
        Thread.sleep(3000);
        click(Boton);
    }
    public void acciones()throws Exception{
        scrollDown(Acciones);
        Thread.sleep(3000);
        click(Acciones);
    }
    public void VER()throws Exception{
        Thread.sleep(3000);
        click(VER);
    }
    public void Espera()throws Exception{
        Thread.sleep(5000);
    }

}

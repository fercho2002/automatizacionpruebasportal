package pom.Boletas;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class ConsultaboletaspagoPage  extends BasePage {

    public ConsultaboletaspagoPage(WebDriver driver) {
        super(driver);
    }

    private String UrlConsulta ="http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/consultar-boletas-pago2";
    private String UrlPagar ="http://dc2tvaweb7:81/pagosenlinea_pre/ResumenPagosD3/ResumenPagoInicial#no-back-button";
    private By MenuPrincipal = By.xpath("//span[contains(.,'Herramientas')]");
    private By Submenu = By.xpath("//li[@class='dropdown open']//a[.='Consulta boletas de pago']");
    //private By fechaDesde = By.xpath("//div[@class='caption']/div[@class='row ']/div[1]//input[@class='field axa-date-input form-control']");
    private By fechaDesde =  By.id("_QueryPaymentInvoicesPortlet_INSTANCE_6TZEvMqjBAOd_FechaInicio");
    //private By fechaHasta = By.xpath("//div[@class='caption']//div[2]//input[@class='field axa-date-input form-control']']");
    private By fechaHasta =  By.id("_QueryPaymentInvoicesPortlet_INSTANCE_6TZEvMqjBAOd_FechaFin");
    private By NBoleta = By.xpath("//div[@class='caption']/div[@class='row ']/div[1]//input[@class='field form-control']");
    private By buscar = By.xpath("//button[@class='btn btn-axa btn-blue btn-secondary']");
    private By acciones = By.xpath("//td[7]//button[@class='btn btn-secondary dropdown-toggle']");
    private By pagarAcciones = By.xpath("//div[@class='dropdown-menu show']/button[contains(.,'Pagar')]");
    private By telefonos=By.xpath("//input[@id='Telefono']");
    private By direccione=By.xpath("//input[@id='Direccion']");
    private By ciudade=By.xpath("//select[@id='Ciudad']");
    private By ChekCondiciones=By.xpath("//div[@class='checkAxa']/label[1]");
    private By BotonPagar2=By.xpath("//button[@id='btnConsultar']");
    private By seleccionarbanco=By.xpath("//*[@id=\"pse_bank_code\"]");
    private By BotonContinuar=By.xpath("//button[@class='px-4 py-4 w-full md:w-1/2 bg-secondary-700 hover:bg-secondary-800 text-white uppercase rounded font-semibold tracking-wide']");
    private By escribirCorrero=By.xpath("//input[@id='PNEMail']");
    private By iralbanco=By.xpath("//input[@id='btnSeguir']");
    private By BotonDEBUG=By.xpath("//input[@id='btnDebug']");
    private By fechadehoy=By.xpath("//input[@id='txtBankProcessDate']");
    private By ingresarNUM=By.xpath("//input[@id='txtAuthorizationID']");
    private By BotonCALL=By.xpath("//input[@id='btnCall']");
    private By BotonPPE=By.xpath("//input[@id='btnReturnToPPE']");


    public void CambiarUrlMenu() throws Exception {
        click(MenuPrincipal);
        //click(Submenu);
        Thread.sleep(2000);
        //openNewTab(UrlConsulta);
        visit(UrlConsulta);
    }
    public void CambiarUrlPagar() throws Exception {
        click(pagarAcciones);
        //click(Submenu);
       Thread.sleep(7000);

    }


    public void ingresarFechaDesde(String fecha_desde) throws Exception {
        validateIframe();
        click(fechaDesde);
        input(fecha_desde,fechaDesde);
        Thread.sleep(2000);

    }
    public void ingresarFechaHasta(String fecha_hasta) throws Exception {
        click(fechaHasta);
        input(fecha_hasta,fechaHasta);
        Thread.sleep(2000);
    }

    public void ingresarBoleta(String boleta) throws Exception {
        input(boleta, NBoleta);
        Thread.sleep(2000);
    }

    public void buscar() throws Exception {
        click(buscar);
        Thread.sleep(5000);
    }

    public void acciones() throws Exception {
        click(acciones);
        Thread.sleep(1000);
    }

    public void pagarAcciones() throws Exception {
        click(pagarAcciones);
    }

    public void telefono(String telefono)throws Exception{

        Thread.sleep(3000);
        input(telefono,telefonos);
    }

    public void direccion(String direccion)throws Exception{
        Thread.sleep(3000);
        input(direccion,direccione);
    }
    public void ciudad(String ciudad)throws Exception{
        Thread.sleep(3000);
        input(ciudad,ciudade);
    }

    public void condiciones()throws Exception{
        Thread.sleep(3000);
        click(ChekCondiciones);
    }
    public void pagar()throws Exception{
        Thread.sleep(3000);
        click(BotonPagar2);
    }
    public void banco(String banco)throws Exception{
        Thread.sleep(3000);
        input(banco,seleccionarbanco);
    }

    public void continuar()throws Exception{
        Thread.sleep(3000);
        click(BotonContinuar);
    }

    public void correo(String correo)throws Exception{
        Thread.sleep(3000);
        input(correo ,escribirCorrero);
    }

    public void iralbanco()throws Exception{
        Thread.sleep(3000);
        click(iralbanco);
    }

    public void debug()throws Exception{
        Thread.sleep(3000);
        click(BotonDEBUG);
    }

    public void fechahoy(String fecha )throws Exception{
        Thread.sleep(3000);
        input(fecha,fechadehoy);
    }

    public void  numero(String numero)throws Exception{
        Thread.sleep(3000);
        input(numero,ingresarNUM);
    }

    public void call()throws Exception{
        Thread.sleep(3000);
        click(BotonCALL);
    }

    public void ppe()throws Exception{
        Thread.sleep(3000);
        click(BotonPPE);
    }

}

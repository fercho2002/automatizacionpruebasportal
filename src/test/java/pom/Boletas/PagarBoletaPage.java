package pom.Boletas;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;
import sun.reflect.generics.tree.Tree;

public class PagarBoletaPage extends BasePage {
    public PagarBoletaPage(WebDriver driver) {
        super(driver); }
    //AQUI LO QUE YA SE TIENE//
    private String Url ="http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/generar-boleta-pago2";
    private By MenuPrincipal = By.xpath("//span[contains(.,'Herramientas')]");
    private By GenerarBoletaPago = By.xpath("//div[@class='span12']//a[.='Generar boleta de pago']");

    //OPCIONES
    private By BontonBuscar1 = By.xpath("//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-search']");
    private By PolizasAntiguas1=By.xpath("//*[@id=\"_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_soat-policies\"]/tbody/tr[1]/td[9]/input");
    private By PolizasAntiguas2=By.xpath("//*[@id=\"_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_soat-policies\"]/tbody/tr[2]/td[9]/input");
    private By PolizasAntiguas3=By.xpath("//*[@id=\"_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_soat-policies\"]/tbody/tr[3]/td[9]/input");
    private By BotonCalcular1=By.xpath("//span[.='Calcular']");
    private By Titulo=By.xpath("//nav[@id='breadcrumbs']/h1[@class='page-title']");
    private By BotonGenrarVM1=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-generate']");
    private By BotonSiVM1=By.xpath("//button[@id='confirmBtn']");
    private By BotonContinuar1VM=By.xpath("//div[@class='yui3-widget-bd modal-body']//span[@class='lfr-btn-label']");


    //AQUI LO QUE SIGUE DESDE PAGAR//
    private String  URL2="http://dc2tvaweb7:81/pagosenlinea/ResumenPagosD3/ResumenPagoInicial#no-back-button";

    private By BotonPAGAR=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-pay']/span[@class='lfr-btn-label']");
    private By telefonos=By.xpath("//input[@id='Telefono']");
    //private By telefonos = new  By.ByClassName("NumeroTelefonoCliente");
    private By direccione=By.xpath("//input[@id='Direccion']");
    private By ciudade=By.xpath("//select[@id='Ciudad']");
    private By ChekCondiciones=  By.xpath("//div[@class='checkAxa']/label[1]");
    private By BotonPagar2=By.xpath("//button[@id='btnConsultar']");
    private By seleccionarbanco=By.xpath("//*[@id=\"pse_bank_code\"]");
    private By BotonContinuar=By.xpath("//button[@class='px-4 py-4 w-full md:w-1/2 bg-secondary-700 hover:bg-secondary-800 text-white uppercase rounded font-semibold tracking-wide cs--button__primary']");
    private By escribirCorrero=By.xpath("//input[@id='PNEMail']");
    private By iralbanco=By.id("btnSeguir");
    private By BotonDEBUG=By.xpath("//input[@id='btnDebug']");
    private By fechadehoy=By.xpath("//input[@id='txtBankProcessDate']");
    private By ingresarNUM=By.xpath("//input[@id='txtAuthorizationID']");
    private By BotonCALL=By.xpath("//input[@id='btnCall']");
    private By BotonPPE=By.xpath("//input[@id='btnReturnToPPE']");
    private By clickk=By.xpath("//header[@class='topHeader']//a[.='Productos para Personas']");

    //inicio//
    public void CambiarUrlMenu() throws Exception {
        click(MenuPrincipal);
        //click(GenerarBoletaPago);
        Thread.sleep(2000);
        visit(Url);
    }

    public void CambiarUrlBanco() throws Exception {
        click(BotonPagar2);
        Thread.sleep(4000);


    }

    public void BUSCAR1()throws Exception{
        validateIframe();
        Thread.sleep(3000);
        scrollDown(BontonBuscar1);
        Thread.sleep(2000);
        click(BontonBuscar1);
        Thread.sleep(1000);

    }

    public void poliza1()throws Exception{
        Thread.sleep(3000);
        click(PolizasAntiguas1);

    }

    public void poliza2()throws Exception{
        Thread.sleep(3000);
        click(PolizasAntiguas2);

    }

    public void BotonCalcular1()throws Exception{
        Thread.sleep(3000);
        click(BotonCalcular1);
    }

    public void BotonGenerar1()throws Exception{

        Thread.sleep(3000);
        click(BotonGenrarVM1);
    }

    public void BotonSI1()throws Exception{
        Thread.sleep(3000);
        click(BotonSiVM1);
    }

    public void BotonContinuar1()throws Exception{
        Thread.sleep(3000);
        click(BotonContinuar1VM);
    }

    //proceso//
    public void BotonPagar()throws Exception{
        Thread.sleep(3000);
        click(BotonPAGAR);
        validateBody();
        locateObject(clickk);
        Thread.sleep(3000);
        click(clickk);
    }

    public void telefono(String telefono)throws Exception{
        locateObject(telefonos);
        Thread.sleep(3000);
        input(telefono,telefonos);
    }

    public void direccion(String direccion)throws Exception{
        Thread.sleep(3000);
        input(direccion,direccione);
    }
    public void ciudad(String ciudad)throws Exception{
        Thread.sleep(3000);
        selectElement(ciudad,ciudade);
    }

    public void condiciones()throws Exception{
        scrollUp(ChekCondiciones);
        Thread.sleep(5000);
        click(ChekCondiciones);
    }
    public void pagar()throws Exception{
        Thread.sleep(3000);
        CambiarUrlBanco();
    }
    public void banco(String banco)throws Exception{
        Thread.sleep(3000);
        selectElement(banco,seleccionarbanco);
    }

    public void continuar()throws Exception{
        Thread.sleep(3000);
        click(BotonContinuar);
        Thread.sleep(3000);
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

 


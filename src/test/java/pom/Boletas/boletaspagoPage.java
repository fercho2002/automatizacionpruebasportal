package pom;

import gherkin.lexer.Th;
import org.apache.http.cookie.ClientCookie;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class boletaspagoPage extends BasePage {

    public boletaspagoPage(WebDriver driver) {
        super(driver);
    }

    private String boletas = "http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/generar-boleta-pago2";
    private By menuportal = By.xpath("//span[contains(.,'Herramientas')]");
    private By submenuportal = By.xpath("//div[@class='span12']//a[.='Generar boleta de pago']");
    private By fechahastaportal = By.xpath("//input[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_FechaFin']");
    private By fechahastaportaltitulo = By.xpath("//label[contains(.,'Fecha expedición hasta')]");
    private By fechadesdeportal = By.xpath("//input[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_FechaInicio']");
    private By fechadesdeportaltitulo = By.xpath("//label[contains(.,'Fecha expedición desde')]");
    private By polizasportal = By.xpath("//input[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_NumeroPoliza']");
    private By polizastituloportal = By.xpath("//label[contains(.,'Número de póliza')]");
    private By claveredportal = By.xpath("//select[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_ClaveRed']");
    private By claveredportaltitulo = By.xpath("//label[contains(.,'Clave de red')]");
    private By placasportal = By.xpath("//input[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_Placa']");
    private By placasportaltitulo = By.xpath("//label[contains(.,'Placa')]");
    private By buscarportal = By.xpath("//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-search']");

    private By check1 = By.xpath("By.xpath(\"//*[@id=\\\"_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_soat-policies\\\"]/tbody/tr[1]/td[9]/input\");");
    private By check2 = By.xpath("By.xpath(\"//*[@id=\\\"_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_soat-policies\\\"]/tbody/tr[2]/td[9]/input\");");
    private By btncalcular = By.xpath("//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-calculate']");


    private  By btngenerar=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-generate']");
    private By mensajes=By.xpath("//div[@class='modalContent']");
    private By btnsi=By.xpath("//button[@id='confirmBtn']");
    private By mensajeboleta=By.xpath("//div[.='La boleta 121997 se ha creado exitosamente.']");
    private By btncontinuar=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-continue']");

    public void menu() throws Exception {
        click(menuportal);
    }

    public void submenu() throws Exception {
        click(submenuportal);
        Thread.sleep(1000);
        openNewTab(boletas);
        Thread.sleep(4000);
    }

    public void fechasd(String fecha_desde) throws Exception {
      //  textEquals("Fecha expedición desde",fechadesdeportaltitulo);
        Thread.sleep(2000);
        validateIframe();
        Thread.sleep(2000);
        input(fecha_desde,fechadesdeportal);
        click(fechadesdeportal);
        Thread.sleep(2000);
    }

    public void fechash(String fecha_hasta) throws Exception {
        //textEquals("Fecha expedición hasta",fechahastaportaltitulo);
        Thread.sleep(2000);
        input(fecha_hasta,fechahastaportal);
        Thread.sleep(1000);
        click(fechahastaportal);
        Thread.sleep(2000);
    }

    public void polizas(String poliza) throws Exception {
      // textEquals("Número de póliza",polizastituloportal);
        input(poliza,polizasportal);
        Thread.sleep(2000);

    }

    public void red(String clave_red) throws Exception {
      //  textEquals("Clave de red",claveredportaltitulo);
        Thread.sleep(2000);
        click(claveredportal);
        selectElement(clave_red,claveredportal);
        Thread.sleep(2000);
    }

    public void buscar() throws Exception {
        click(buscarportal);
        Thread.sleep(3000);
        scrollDown(buscarportal);
    }


    public void placas(String placa) throws Exception {
      //  textEquals("Placa",placasportaltitulo);
        input(placa,placasportal);
        Thread.sleep(2000);
    }

    public void Checkuno() throws Exception {
     click(check1);
     Thread.sleep(3000);

    }

    public void checkdos() throws Exception {
        click(check2);
        Thread.sleep(3000);
    }

    public void calcular() throws Exception {
        click(btncalcular);
        Thread.sleep(6000);
    }

    public void generar() throws Exception {
        click(btngenerar);
        Thread.sleep(3000);
    }

    public void mensaje() {
   // textEquals("¿Está seguro que desea generar la boleta?",mensajes);
    }

    public void si() throws Exception {
        click(btnsi);
        Thread.sleep(2000);
    }

    public void mensajeboleta() {
        //textEquals("La boleta 121997 se ha creado exitosamente.",mensajeboleta);
    }

    public void continuar() throws Exception {
        Thread.sleep(2000);
        click(btncontinuar);
        Thread.sleep(4000);
    }
}

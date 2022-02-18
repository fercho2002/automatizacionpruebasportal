package pom.Boletas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class EditarBoletas_page extends BasePage {

    public EditarBoletas_page(WebDriver driver) {
        super(driver);
    }

    //aqui se cambia la URL
    private String Url ="http://sucursalenlinea.qa.axacolpatria.co:8081/group/guest/generar-boleta-pago2";
    private By MenuPrincipal = By.xpath("//span[contains(.,'Herramientas')]");
    private By GenerarBoletaPago = By.xpath("//div[@class='span12']//a[.='Generar boleta de pago']");

    //OPCIONES
    private By BontonBuscar1 = By.xpath("//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-search']");
    private By PolizasAntiguas1=By.xpath("//*[@id=\"_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_soat-policies\"]/tbody/tr[1]/td[9]/input");
    private By PolizasAntiguas2=By.xpath("//*[@id=\"_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_soat-policies\"]/tbody/tr[2]/td[9]/input");
    private By BotonCalcular1=By.xpath("//span[.='Calcular']");
    private By BotonGenrarVM1=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-generate']/span[@class='lfr-btn-label']");
    private By BotonSiVM1=By.xpath("//button[@id='confirmBtn']");
    private By BotonContinuar1VM=By.xpath("//div[@class='yui3-widget-bd modal-body']//span[@class='lfr-btn-label']");
    private By BotonEditar1VM=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-edit']");
    private By chek1=By.xpath("//*[@id=\"_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_soat-policies\"]/tbody/tr[2]/td[9]/input");
    private By BotonCALCULAR2=By.xpath("//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-calculate']");
    private By BotonGENERAR2=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-generate']");
    private By BotonSIVM2=By.xpath("//button[@id='confirmBtn']");
    private By BotonCONTINUAR2=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-continue']");
    private By BotonEditarFinal=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-edit']");

    //segundo caso//

    private By BotonAgregar=By.xpath("//a[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-add']");
    private By PolizaAgregada=By.xpath("//*[@id=\"_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_soat-policies\"]/tbody/tr[3]/td[9]/input");
    private By BOTONCAL=By.xpath("//span[.='Calcular']");
    private By BOTONGENER=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-generate']/span[@class='lfr-btn-label']");
    private By BOTONSIVEM=By.xpath("//button[@id='confirmBtn']");
    private By BOTONCONTVEN=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-continue']");
    private By BOTONEDITAR3=By.xpath("//div[@class='yui3-widget-bd modal-body']//button[@id='_GeneratePaymentInvoicePortlet_INSTANCE_zRepADESBXUI_btn-edit']");



    public void CambiarUrlMenu() throws Exception {


        click(MenuPrincipal);
        Thread.sleep(1000);
        click(GenerarBoletaPago);
        Thread.sleep(2000);
        openNewTab(Url);

    }
    public void BUSCAR1()throws Exception{
        validateIframe();
        Thread.sleep(3000);
        click(BontonBuscar1);
        scrollDown(BontonBuscar1);
    }
    public void poliza1()throws Exception{
        click(PolizasAntiguas1);
        Thread.sleep(3000);
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
    public void BotonEditar1()throws Exception{
        Thread.sleep(3000);
        click(BotonEditar1VM);
    }
    public void Chek1()throws Exception{
        Thread.sleep(3000);
        click(chek1);
    }
    public void BotonCalcular2()throws Exception{
        Thread.sleep(3000);
        click(BotonCALCULAR2);
    }
    public void BotonGenerar2()throws Exception{
        Thread.sleep(3000);
        click(BotonGENERAR2);
    }
    public void BotonSivm2()throws Exception{
        Thread.sleep(3000);
        click(BotonSIVM2);

    }
    public void BotonCONTINUAR2()throws Exception{
        Thread.sleep(3000);
        click(BotonCONTINUAR2);
    }
    public void botoneditarfinal()throws Exception{
        Thread.sleep(3000);
        click(BotonEditarFinal);
    }
    public void Espera()throws Exception{
        Thread.sleep(3000);
    }
    public void BotonAGR()throws Exception{
        Thread.sleep(3000);
        click(BotonAgregar);
    }
    public void polizaAgr()throws Exception{
        Thread.sleep(3000);
        click(PolizaAgregada);
    }
    public void BOTONCAL()throws Exception{
        Thread.sleep(3000);
        click(BOTONCAL);
    }
    public void BOTONGENERAR()throws Exception{
        Thread.sleep(3000);
        click(BOTONGENER);
    }
    public void BOTONSIVEM()throws Exception{
        Thread.sleep(3000);
        click(BOTONSIVEM);
    }
    public void botoncontinnuar()throws Exception{
        Thread.sleep(3000);
        click(BOTONCONTVEN);
    }
    public void botoneditar()throws Exception {
        Thread.sleep(3000);
        click(BOTONEDITAR3);
    }
}

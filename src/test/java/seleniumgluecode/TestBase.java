package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.*;
import pom.Boletas.*;
import pom.Gestion_Usuarios.BuscarUsuariosPage;
import pom.Reporte_Boletas.BuscarDescargarReporteBoleta;
import pom.Reporte_Cartera.ConsultarCartera;
import pom.boletaspagoPage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected LoginPortalPage loginPortalPage = new LoginPortalPage(driver);
    protected boletaspagoPage BoletasPagoPage = new boletaspagoPage(driver);
    protected PagarBoletaPage pagarBoletaPage = new PagarBoletaPage(driver);
    protected VisualizarBoletaPage visualizarBoletaPage = new VisualizarBoletaPage(driver);
    protected EditarBoletas_page editarBoletas_page = new EditarBoletas_page(driver);
    protected ConsultaboletaspagoPage consultaboletaspagoPage = new ConsultaboletaspagoPage(driver);
    protected BuscarUsuariosPage buscarusuarios = new BuscarUsuariosPage(driver);
    protected ConsultarCartera consultarCartera = new ConsultarCartera(driver);
    protected AnularBoletaPage anularBoleta = new AnularBoletaPage(driver);
    protected BuscarDescargarReporteBoleta reporteBoletas = new BuscarDescargarReporteBoleta(driver);

}
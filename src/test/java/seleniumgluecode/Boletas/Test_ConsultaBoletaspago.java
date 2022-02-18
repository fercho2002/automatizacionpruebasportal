package seleniumgluecode.Boletas;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_ConsultaBoletaspago extends TestBase {

    @And("^ingresar la fecha desde consultar\"([^\"]*)\"$")
    public void ingresar_la_fecha_desde_consultar(String fecha_desde) throws Throwable {
        consultaboletaspagoPage.ingresarFechaDesde(fecha_desde);
    }

    @And("^ingresar la fecha hasta consultar\"([^\"]*)\"$")
    public void ingresar_la_fecha_hasta_consultar(String fecha_hasta) throws Throwable {
        consultaboletaspagoPage.ingresarFechaHasta(fecha_hasta);
    }

    @When("^Ingresar al submenu consultar boletas de pago$")
    public void ingresar_al_submenu_consultar_boletas_de_pago() throws Throwable {
    consultaboletaspagoPage.CambiarUrlMenu();
    }

    @And("^ingresar numero boleta\"([^\"]*)\"$")
    public void ingresar_numero_boleta(String boleta) throws Throwable {

    consultaboletaspagoPage.ingresarBoleta(boleta);
    }

    @And("^Realizar clic en el boton Buscar$")
    public void realizar_clic_en_el_boton_Buscar() throws Throwable {
    consultaboletaspagoPage.buscar();
    }

    @And("^darle click en el boton acciones$")
    public void darle_click_en_el_boton_acciones() throws Throwable {
        consultaboletaspagoPage.acciones();
    }

    @And("^Dar click en pagar$")
    public void dar_click_en_pagar() throws Throwable {
        consultaboletaspagoPage.CambiarUrlPagar();
    }


}

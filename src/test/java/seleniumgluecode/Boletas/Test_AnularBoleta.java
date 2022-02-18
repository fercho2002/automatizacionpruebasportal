package seleniumgluecode.Boletas;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_AnularBoleta extends TestBase {
    @Given("^hacer click en la ventana de herramientas de la pantallaprincipal$")
    public void hacer_click_en_la_ventana_de_herramientas_de_la_pantallaprincipal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anularBoleta.clickHerramientas();


    }

    @When("^hacer click en la opcion de consultar boletas$")
    public void hacer_click_en_la_opcion_de_consultar_boletas() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anularBoleta.cambiarUrl();


    }

    @When("^ingresar la fecha creacion desde  con el campo\"([^\"]*)\"$")
    public void ingresar_la_fecha_creacion_desde_con_el_campo(String fecha) throws Throwable {
        // Write code here that turns the phrase above into concrete actionsthrow new PendingException();
        anularBoleta.fechaDesde(fecha);
    }

    @When("^ingresar la fecha creacion hasta con el campo\"([^\"]*)\"$")
    public void ingresar_la_fecha_creacion_hasta_con_el_campo(String fecha) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anularBoleta.fechaHasta(fecha);

    }

    @When("^seleccionar el estado con el campo \"([^\"]*)\"$")
    public void seleccionar_el_estado_con_el_campo(String estadoBoleta) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anularBoleta.estado(estadoBoleta);

    }

    @When("^hacer click en el boton de buscar$")
    public void hacer_click_en_el_boton_de_buscar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anularBoleta.buscar();

    }
    @When("^en la primera boleta seleccionar la opcion de anular con el campo \"([^\"]*)\"$")
    public void en_la_primera_boleta_seleccionar_la_opcion_de_anular_con_el_campo(String estado) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anularBoleta.cambiarEstado(estado);
    }
    @When("^hacer click en si para confirmar la anulacion de la boleta$")
    public void hacer_click_en_si_para_confirmar_la_anulacion_de_la_boleta() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anularBoleta.clickSi();

    }

    @When("^Hacer click para confirmar que se anulo la boleta corectamente$")
    public void hacer_click_para_confirmar_que_se_anulo_la_boleta_corectamente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        anularBoleta.aceptar();

    }


}

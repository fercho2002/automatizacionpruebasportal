package seleniumgluecode.Reporte_Cartera;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_ConsultarCartera extends TestBase {

    @Given("^hacer click en la opcion de herramientas$")
    public void hacer_click_en_la_opcion_de_herramientas() throws Throwable {
        consultarCartera.AbrirHerramientas();

    }

    @When("^seleccionar la opcion consultar estado de cartera$")
    public void seleccionar_la_opcion_consultar_estado_de_cartera() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.cambiarUrl();

    }

    @When("^colocar el estado en el campo de \"([^\"]*)\"$")
    public void colocar_el_estado_en_el_campo_de(String estadoUsuario) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.estado(estadoUsuario);
    }

    @When("^colocar fecha en el campo de \"([^\"]*)\"$")
    public void colocar_fecha_en_el_campo_de(String fecha) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.fecha(fecha);
    }

    @When("^colocar clave de red en el campo de \"([^\"]*)\"$")
    public void colocar_clave_de_red_en_el_campo_de(String clave) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.claveRed(clave);

    }

    @When("^colocar el codigo de punto de venta en el campo de \"([^\"]*)\"$")
    public void colocar_el_codigo_de_punto_de_venta_en_el_campo_de(String codigo) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.codigoPunto(codigo);

    }

    @When("^hacer click en buscar$")
    public void hacer_click_en_buscar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.buscar();

    }
    @When("^dar click en descargar$")
    public void dar_click_en_descargar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.descargar();

    }
    @When("^seleccionar la opcion detalle cartera pendiente$")
    public void seleccionar_la_opcion_detalle_cartera_pendiente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.cambiarUrlCarteraPendiente();

    }

    @When("^colocar la fecha para el filtro en el campo de \"([^\"]*)\"$")
    public void colocar_la_fecha_para_el_filtro_en_el_campo_de(String fecha) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.fechaCarteraPendiente(fecha);
    }

    @When("^hacer click en ver cartera pendiente$")
    public void hacer_click_en_ver_cartera_pendiente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        consultarCartera.descargarCarteraPendiente();

    }

}

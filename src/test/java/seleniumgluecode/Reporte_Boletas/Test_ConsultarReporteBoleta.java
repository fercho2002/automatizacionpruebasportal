package seleniumgluecode.Reporte_Boletas;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_ConsultarReporteBoleta extends TestBase {

    @Given("^hacer click en la opcion de herramientas en el menu principal$")
    public void hacer_click_en_la_opcion_de_herramientas_en_el_menu_principal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        reporteBoletas.Herramientas();

    }

    @When("^seleccione la opcion de Reporte Boltas de pago$")
    public void seleccione_la_opcion_de_Reporte_Boltas_de_pago() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        reporteBoletas.cambiarUrl();

    }

    @When("^ingrese la fecha de creacion desde \"([^\"]*)\"$")
    public void ingrese_la_fecha_de_creacion_desde(String fechaDesde) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        reporteBoletas.fecha_desde(fechaDesde);

    }

    @When("^ingrese la fecha de creacion hasta \"([^\"]*)\"$")
    public void ingrese_la_fecha_de_creacion_hasta(String fechaHasta) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        reporteBoletas.fecha_hasta(fechaHasta);

    }

    @When("^ingresar el estado de la boleta \"([^\"]*)\"$")
    public void ingresar_el_estado_de_la_boleta(String estadoBoleta) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //reporteBoletas.estado(estadoBoleta);

    }

    @When("^ingresar la clave de red \"([^\"]*)\"$")
    public void ingresar_la_clave_de_red(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^ingresar el codigo de punto de venta \"([^\"]*)\"$")
    public void ingresar_el_codigo_de_punto_de_venta(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^dar click en el boton de buscar$")
    public void dar_click_en_el_boton_de_buscar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        reporteBoletas.buscar();

    }

    @When("^dar click en el boton de descargar$")
    public void dar_click_en_el_boton_de_descargar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        reporteBoletas.descargar();
    }
}

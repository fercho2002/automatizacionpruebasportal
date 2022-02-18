package seleniumgluecode.Gestion_Usuarios;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_BuscarUsuarios extends TestBase {

    @Given("^hacer click en la OPCION de herramientas$")
    public void hacer_click_en_la_OPCION_de_herramientas() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.AbrirHerramientras();

    }
    @When("^seleccione la OPCION de gestion de usuarios$")
    public void seleccione_la_OPCION_de_gestion_de_usuarios() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.CambiarUrl();
    }
    @When("^hacer click en la opcion de buscar$")
    public void hacer_click_en_la_opcion_de_buscar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.botonBuscar();

    }



    @When("^colocar el estado en el campo \"([^\"]*)\"$")
    public void colocar_el_estado_en_el_campo(String estadoUsuario) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.estado(estadoUsuario);


    }


    @When("^colocar clave de red en el campo \"([^\"]*)\"$")
    public void colocar_clave_de_red_en_el_campo(String claveRed) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.claveRed(claveRed);

    }

    @When("^colocar el codigo de punto de venta en el campo \"([^\"]*)\"$")
    public void colocar_el_codigo_de_punto_de_venta_en_el_campo(String codigoPunto) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.codigo(codigoPunto);

    }
    @When("^selecciuonar el estado como activo \"([^\"]*)\"$")
    public void selecciuonar_el_estado_como_activo(String estado2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.seleccionarEstado(estado2);
    }

    @When("^dar click en guardar$")
    public void dar_click_en_guardar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.guardar();
    }
    @When("^dar click en si en la pantalla emergente$")
    public void dar_click_en_si_en_la_pantalla_emergente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.confirmar();
    }
    @When("^seleccionar la casilla de activar todos$")
    public void seleccionar_la_casilla_de_activar_todos() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        buscarusuarios.seleccionarsi();
    }







}

package seleniumgluecode.Boletas;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_PagarBoleta extends TestBase {
    
    @Given("^hacer click en la OPCION herramientas del inicio$")
    public void hacer_click_en_la_OPCION_herramientas_del_inicio() throws Throwable {
        pagarBoletaPage.CambiarUrlMenu();
    }

    @When("^Darle click en el BOTON buscar$")
    public void darle_click_en_el_BOTON_buscar() throws Throwable {
        pagarBoletaPage.BUSCAR1();
    }

    @When("^seleccionar la primera poliza$")
    public void seleccionar_la_primera_poliza() throws Throwable {
        pagarBoletaPage.poliza1();
    }

    @When("^Seleccionar la segunda poliza$")
    public void seleccionar_la_segunda_poliza() throws Throwable {
        pagarBoletaPage.poliza2();
    }

    @When("^Darle click en el BOTON calcular$")
    public void darle_click_en_el_BOTON_calcular() throws Throwable {
        pagarBoletaPage.BotonCalcular1();
    }

    @When("^Darle click en el BOTON generar de la ventana amergente$")
    public void darle_click_en_el_BOTON_generar_de_la_ventana_amergente() throws Throwable {
        pagarBoletaPage.BotonGenerar1();
    }

    @When("^Darle click en el BOTON si de la ventana emergente$")
    public void darle_click_en_el_BOTON_si_de_la_ventana_emergente() throws Throwable {
        pagarBoletaPage.BotonSI1();
    }

    @When("^Darle click en el BOTON continuar de la ventana emergente$")
    public void darle_click_en_el_BOTON_continuar_de_la_ventana_emergente() throws Throwable {
        pagarBoletaPage.BotonContinuar1();
    }

    @When("^Darle click en boton pagar de la ventana emergente$")
    public void darle_click_en_boton_pagar_de_la_ventana_emergente() throws Throwable {
        pagarBoletaPage.BotonPagar();
    }

    @When("^Colocar un numero de telefono en \"([^\"]*)\"$")
    public void colocar_un_numero_de_telefono_en(String telefono) throws Throwable {
        pagarBoletaPage.telefono(telefono);
    }

    @When("^Colocar una direccion en el campo \"([^\"]*)\"$")
    public void colocar_una_direccion_en_el_campo(String direccion) throws Throwable {
        pagarBoletaPage.direccion(direccion);
    }

    @When("^Colocar una ciudad en el campo \"([^\"]*)\"$")
    public void colocar_una_ciudad_en_el_campo(String ciudad) throws Throwable {
        pagarBoletaPage.ciudad(ciudad);
    }

    @When("^Darle Click en el cuadro para aceptar las condiciones$")
    public void darle_Click_en_el_cuadro_para_aceptar_las_condiciones() throws Throwable {
        pagarBoletaPage.condiciones();
    }

    @When("^darle click en el boton pagar del portal$")
    public void darle_click_en_el_boton_pagar_del_portal() throws Throwable {
        pagarBoletaPage.pagar();
    }

    @When("^ingresar un banco en \"([^\"]*)\"$")
    public void ingresar_un_banco_en(String banco) throws Throwable {
        pagarBoletaPage.banco(banco);
    }

    @When("^Darle click en continuar$")
    public void darle_click_en_continuar() throws Throwable {
        pagarBoletaPage.continuar();
    }

    @When("^ingresar un correo en \"([^\"]*)\"$")
    public void ingresar_un_correo_en(String correo) throws Throwable {
        pagarBoletaPage.correo(correo);
    }

    @When("^darle click en ir al banco$")
    public void darle_click_en_ir_al_banco() throws Throwable {
        pagarBoletaPage.iralbanco();
    }

    @When("^darle click en el boton debug$")
    public void darle_click_en_el_boton_debug() throws Throwable {
        pagarBoletaPage.debug();
    }

    @When("^colocar la fecha actual en \"([^\"]*)\"$")
    public void colocar_la_fecha_actual_en(String fecha) throws Throwable {
        pagarBoletaPage.fechahoy(fecha);
    }

    @When("^colocar el numero de autorizacion en \"([^\"]*)\"$")
    public void colocar_el_numero_de_autorizacion_en(String numero) throws Throwable {
        pagarBoletaPage.numero(numero);
    }

    @When("^Darle click en el boton$")
    public void darle_click_en_el_boton() throws Throwable {
        pagarBoletaPage.call();
    }

    @When("^Darle click en el boton return to PPE$")
    public void darle_click_en_el_boton_return_to_PPE() throws Throwable {
        pagarBoletaPage.ppe();
    }
}

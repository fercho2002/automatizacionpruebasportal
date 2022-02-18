package seleniumgluecode.Boletas;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import seleniumgluecode.TestBase;

public class Test_editarboleta extends TestBase {
    @Given("^hacer click en la opcion herramientas del inicio$")
    public void hacer_click_en_la_opcion_herramientas_del_inicio() throws Throwable {
    editarBoletas_page.CambiarUrlMenu();
    }



    @And("^Darle click en el boton buscar$")
    public void darle_click_en_el_boton_buscar() throws Throwable {
        editarBoletas_page.BUSCAR1();
    }

    @And("^seleccionar la poliza mas antigua numero uno$")
    public void seleccionar_la_poliza_mas_antigua_numero_uno() throws Throwable {
        editarBoletas_page.poliza1();
    }

    @And("^Seleccionar la poliza mas antigua numero dos$")
    public void seleccionar_la_poliza_mas_antigua_numero_dos() throws Throwable {
        editarBoletas_page.poliza2();
    }


    @And("^Darle click en el boton calcular$")
    public void darle_click_en_el_boton_calcular() throws Throwable {
        editarBoletas_page.BotonCalcular1();
    }

    @And("^Darle click en el boton generar de la ventana amergente$")
    public void darle_click_en_el_boton_generar_de_la_ventana_amergente() throws Throwable {
        editarBoletas_page.BotonGenerar1();
    }

    @And("^Darle click en el boton si de la ventana emergente$")
    public void darle_click_en_el_boton_si_de_la_ventana_emergente() throws Throwable {
        editarBoletas_page.BotonSI1();
    }

    @And("^Darle click en el boton continuar de la ventana emergente$")
    public void darle_click_en_el_boton_continuar_de_la_ventana_emergente() throws Throwable {
        editarBoletas_page.BotonContinuar1();
    }

    @And("^Darle click en boton editar de la ventana emergente$")
    public void darle_click_en_boton_editar_de_la_ventana_emergente() throws Throwable {
        editarBoletas_page.BotonEditar1();
    }

    @And("^deseleccionar una de las polizas atadas para pagar$")
    public void deseleccionar_una_de_las_polizas_atadas_para_pagar() throws Throwable {
        editarBoletas_page.Chek1();
    }

    @And("^darle click en el boton CALCULAR$")
    public void darle_click_en_el_boton_CALCULAR() throws Throwable {
        editarBoletas_page.BotonCalcular2();
    }

    @And("^Darle click en el boton GENERAR de la ventana emergente$")
    public void darle_click_en_el_boton_GENERAR_de_la_ventana_emergente() throws Throwable {
        editarBoletas_page.BotonGenerar2();
    }

    @And("^darle click en el boton si para aceptar los cambios en la ventana emergente$")
    public void darle_click_en_el_boton_si_para_aceptar_los_cambios_en_la_ventana_emergente() throws Throwable {
        editarBoletas_page.BotonSivm2();
    }

    @And("^Darle click en el boton CONTNIUAR de la ventana emergente$")
    public void darle_click_en_el_boton_CONTNIUAR_de_la_ventana_emergente() throws Throwable {
        editarBoletas_page.BotonCONTINUAR2();
    }

    @And("^Darle click en editar nuevamente para validar los cambios hechos$")
    public void darle_click_en_editar_nuevamente_para_validar_los_cambios_hechos() throws Throwable {
        editarBoletas_page.botoneditarfinal();

    }
    @Then("^validar los cambios$")
    public void validar_los_cambios() throws Throwable {
        editarBoletas_page.Espera();
    }
    @And("^darle click al boton agregar$")
    public void darle_click_al_boton_agregar() throws Throwable {
        editarBoletas_page.BotonAGR();
    }

    @And("^seleccionar la poliza para agregar$")
    public void seleccionar_la_poliza_para_agregar() throws Throwable {
        editarBoletas_page.polizaAgr();
    }

    @And("^Darle click en el boton CALCULAR de la ventana emergente$")
    public void darle_click_en_el_boton_CALCULAR_de_la_ventana_emergente() throws Throwable {
        editarBoletas_page.BOTONCAL();
    }

    @And("^darle click en el boton GENERAR2 de la ventana emergente$")
    public void darle_click_en_el_boton_GENERAR2_de_la_ventana_emergente() throws Throwable {
        editarBoletas_page.BotonGenerar1();
    }

    @And("^Darle click en el boton SI de la ventana emergente$")
    public void darle_click_en_el_boton_SI_de_la_ventana_emergente() throws Throwable {
        editarBoletas_page.BOTONSIVEM();
    }

    @And("^DARLE CLICL AL BOTON CONTINUAR DE LA VENTANA EMERGENTE$")
    public void darle_CLICL_AL_BOTON_CONTINUAR_DE_LA_VENTANA_EMERGENTE() throws Throwable {
        editarBoletas_page.botoncontinnuar();
    }

    @Given("^darle click en el boton editar(\\d+)$")
    public void darle_click_en_el_boton_editar(int arg1) throws Throwable {
        editarBoletas_page.botoneditar();
        editarBoletas_page.Espera();

    }

}

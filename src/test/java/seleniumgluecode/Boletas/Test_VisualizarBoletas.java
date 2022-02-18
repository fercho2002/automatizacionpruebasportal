package seleniumgluecode.Boletas;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumgluecode.TestBase;

public class Test_VisualizarBoletas extends TestBase {
    @When("^darle click en el sub menu consultar$")
    public void darle_click_en_el_sub_menu_consultar() throws Throwable {
        visualizarBoletaPage.CambiarUrlMenu();
    }

    @And("^ingresar una fecha inicial en el campo  \"([^\"]*)\"$")
    public void ingresar_una_fecha_inicial_en_el_campo(String fecha_inicio) throws Throwable {
        visualizarBoletaPage.fechaINICIO(fecha_inicio);
    }

    @And("^ingresar una fehca final en el campo \"([^\"]*)\"$")
    public void ingresar_una_fehca_final_en_el_campo(String  fecha_final) throws Throwable {
        visualizarBoletaPage.FechaFINAL(fecha_final);
    }

    @And("^darle click en el boton buscar$")
    public void darle_click_en_el_boton_buscar() throws Throwable {
        visualizarBoletaPage.Boton();

    }

//    @And("^darle click en el boton acciones$")
//    public void darle_click_en_el_boton_acciones() throws Throwable {
//        visualizarBoletaPage.acciones();
//    }

    @Then("^darle click en el boton VER$")
    public void darle_click_en_el_boton_VER() throws Throwable {
        visualizarBoletaPage.VER();
        visualizarBoletaPage.Espera();
    }


}

package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_LoginPortal extends TestBase {

    @Given("^el usuario debe estar en la página de login$")
    public void el_usuario_debe_estar_en_la_página_de_login() throws Throwable {
        loginPortalPage.LoginPage();
    }

    @When("^se ingresa el tipo de documento \"([^\"]*)\"$")
    public void se_ingresa_el_tipo_de_documento(String Tipo_Documento) throws Throwable {
        loginPortalPage.ValorInputTipoDocumento(Tipo_Documento);
    }

    @When("^se ingresa el numero de documento \"([^\"]*)\"$")
    public void se_ingresa_el_numero_de_documento(String Numero_Documento) throws Throwable {
        loginPortalPage.ValorInputNumeroDocumento(Numero_Documento);
    }

    @When("^se ingresa la contraseña \"([^\"]*)\"$")
    public void se_ingresa_la_contraseña(String Contraseña) throws Throwable {
        loginPortalPage.ValorInputContraseña(Contraseña);
    }

    @When("^se presiona el botón Iniciar sesion$")
    public void se_presiona_el_botón_Iniciar_sesion() throws Throwable {
        loginPortalPage.AccionBotonIniciarSesion();
    }

    @Then("^se mostrará la pantalla principal del portal gestion$")
    public void se_mostrará_la_pantalla_principal_del_portal_gestion() throws Throwable {
        loginPortalPage.ValidarHomePrincipal();
    }
}

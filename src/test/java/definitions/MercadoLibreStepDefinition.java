package definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeStep;

import java.util.List;

public class MercadoLibreStepDefinition {

    @Steps
    private HomeStep homeStep;

    @Given("miguel ingresa a web de mercado libre")
    public void miguel_ingresa_a_web_de_mercado_libre() {
        homeStep.openBrowser();
    }

    @Given("Busca un producto y da clik en agregar al carrito")
    public void buscaUnProductoYDaClikEnAgregarAlCarrito(DataTable dataTable) throws InterruptedException {
        homeStep.buscarProducto(dataTable.asList(String.class).get(0));
        homeStep.agregarCarrito();
    }

    @When("Crea una cuenta con su respectiva validacion de datos")
    public void crea_una_cuenta_con_su_respectiva_validacion_de_datos(List<List<String>> datos) throws InterruptedException {
        homeStep.CrearCuentaPersonal(datos.get(0).get(0),datos.get(0).get(1),datos.get(0).get(2));
    }

    @Then("miguel debera ver que que la validacion de su telefono fue enviada")
    public void miguel_debera_ver_que_que_la_validacion_de_su_telefono_fue_enviada() {

    }
}

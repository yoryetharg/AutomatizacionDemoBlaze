package automation.stepdefinitions.buy;

import automation.exceptions.ExcepcionErrors;
import automation.interactions.NavegarA;
import automation.interactions.Wait;
import automation.questions.ValidarCompra;
import automation.questions.ValidarPrecio;
import automation.questions.ValidarUsuario;
import automation.tasks.*;
import automation.utils.Constantes;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;

import static automation.userinterfaces.Productos.BTN_IRACARRITO;
import static automation.utils.Constantes.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarProductoStepDefinition {

    @Dado("que el usuario se encuentra en el inicio de la pagina web")
    public void queElUsuarioSeEncuentraEnElInicioDeLaPaginaWeb() {
        theActorCalled(ACTOR).wasAbleTo(NavegarA.paginaPrincipal());
    }

    @Cuando("el usuario agregue el producto {string} y {string} al carrito de compra")
    public void elUsuarioAgregueElProductoYAlCarritoDeCompra(String producto1, String producto2) {
        theActorCalled(ACTOR).attemptsTo(AgregarEnCarrito.losProductos(producto1,producto2),
                Wait.theSeconds(3), Click.on(BTN_IRACARRITO));
    }

    @Entonces("se valida que queden agregados al carrito")
    public void seValidaQueQuedenAgregadosAlCarrito() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPrecio.deProdctosAgregados())
                .orComplainWith(ExcepcionErrors.class, ERROR_AGREGAR_PRODUCTOS));
    }

    @Cuando("el usuario diligencia los campos del formulario")
    public void elUsuarioDiligenciaLosCamposDelFormulario() {
        theActorCalled(ACTOR).attemptsTo(CrearUsuario.exitosamente(), AutenticarUsuario.exitosamente());
    }

    @Entonces("el usuario ve su nombre en la parte superior de la pagina")
    public void elUsuarioVeSuNombreEnLaParteSuperiorDeLaPagina() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarUsuario.creadoExitosamente())
                .orComplainWith(ExcepcionErrors.class, ERROR_CREAR_USUARIO));
    }

    @Cuando("el usuario compra productos")
    public void elUsuarioCompraProductos() {
        theActorCalled(ACTOR).attemptsTo(Comprar.productos(),
                DiligenciarDatos.delComprador());
    }

    @Entonces("el usuario ve el detalle de la compra")
    public void elUsuarioVeElDetalleDeLaCompra() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCompra.exitosa())
                .orComplainWith(ExcepcionErrors.class, ERROR_COMPRANDO_PRODUCTOS));
    }


}

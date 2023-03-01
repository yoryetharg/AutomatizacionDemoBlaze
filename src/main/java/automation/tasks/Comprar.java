package automation.tasks;

import automation.interactions.Agregar;
import automation.interactions.AgregarProductos;
import automation.interactions.Wait;
import automation.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static automation.userinterfaces.Productos.BTN_IRACARRITO;
import static automation.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Comprar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AgregarProductos.alCarrito(CELULAR, CELULAR_A_COMPRAR),
                Wait.theSeconds(2),
                IrA.inicio(),
                AgregarProductos.alCarrito(COMPUTADOR, COMPUTADOR_A_COMPRAR),
                Wait.theSeconds(2),
                IrA.inicio(),
                AgregarProductos.alCarrito(MONITOR, MONITOR_A_COMPRAR),
                Wait.theSeconds(2),
                Click.on(BTN_IRACARRITO)
                );

    }

    public static Performable productos(){
        return instrumented(Comprar.class);
    }
}

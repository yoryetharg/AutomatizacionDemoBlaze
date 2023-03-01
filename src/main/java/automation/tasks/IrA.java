package automation.tasks;

import automation.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static automation.userinterfaces.Productos.BTN_INICIO;

public class IrA implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.theSeconds(2),
                Click.on(BTN_INICIO));
    }

    public static Performable inicio() {
        return Tasks.instrumented(IrA.class);
    }
}

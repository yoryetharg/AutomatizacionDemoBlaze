package automation.tasks;

import automation.interactions.Wait;
import automation.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static automation.userinterfaces.CrearUsuario.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_REGISTRAR_USUARIO),
                Wait.theSeconds(2),
                Enter.theValue(Constantes.NOMBRE_NUEVO_USUARIO).into(TXT_NOMBRE),
                Enter.theValue(Constantes.CONTRASENIA).into(TXT_CONTRASENIA),
                Click.on(BTN_FINALIZAR_REGISTRO), Wait.theSeconds(2),
                Click.on(BTN_CERRAR_REGISTRO)
        );
    }

    public static Performable exitosamente() {
        return instrumented(CrearUsuario.class);
    }
}

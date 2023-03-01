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

public class AutenticarUsuario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_INICIAR_SESION),
                Wait.theSeconds(2),
                Enter.theValue(Constantes.NOMBRE_NUEVO_USUARIO).into(TXT_USUARIO),
                Enter.theValue(Constantes.CONTRASENIA).into(TXT_PASS),
                Click.on(BTN_LOGUEAR), Wait.theSeconds(3)
        );
    }

    public static Performable exitosamente() {
        return instrumented(AutenticarUsuario.class);
    }
}

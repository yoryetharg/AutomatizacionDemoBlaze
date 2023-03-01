package automation.tasks;

import automation.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static automation.userinterfaces.Compra.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarDatos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ORDEN_COMPRA),
                Enter.theValue(Constantes.NOMBRE).into(TXT_NOMBRE),
                Enter.theValue(Constantes.PAIS).into(TXT_PAIS),
                Enter.theValue(Constantes.CIUDAD).into(TXT_CIUDAD),
                Enter.theValue(Constantes.TARJETA_CREDITO).into(TXT_TARJETA_CREDITO),
                Enter.theValue(Constantes.MES).into(TXT_MES),
                Enter.theValue(Constantes.ANIO).into(TXT_ANIO),
                Click.on(BTN_FINALIZAR_COMPRA)
        );
    }

    public static Performable delComprador(){
        return instrumented(DiligenciarDatos.class);
    }
}

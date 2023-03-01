package automation.tasks;

import automation.interactions.Agregar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AgregarEnCarrito implements Task {

    private String producto1;
    private String producto2;

    public AgregarEnCarrito(String producto1, String producto2) {
        this.producto1 = producto1;
        this.producto2 = producto2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Agregar.producto(producto1),
                IrA.inicio(),
                Agregar.producto(producto2));
    }

    public static Performable losProductos(String producto1, String producto2) {
        return Tasks.instrumented(AgregarEnCarrito.class, producto1, producto2);
    }
}

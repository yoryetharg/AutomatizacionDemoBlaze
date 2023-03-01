package automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearUsuario {
    public static final Target BTN_REGISTRAR_USUARIO =
            Target.the("sign up").located(By.xpath("//a[@id='signin2']"));
    public static final Target TXT_NOMBRE =
            Target.the("register user").located(By.xpath("//input[@id='sign-username']"));
    public static final Target TXT_CONTRASENIA =
            Target.the("register pasword").located(By.xpath("//input[@id='sign-password']"));
    public static final Target BTN_FINALIZAR_REGISTRO =
            Target.the("sign up").located(By.xpath("//button[contains(text(),'Sign up')]"));
    public static final Target BTN_CERRAR_REGISTRO =
            Target.the("Cerrar").located(By.xpath("//div[@class='modal fade show']//button[contains(text(),'Close')]"));
    public static final Target BTN_INICIAR_SESION =
            Target.the("Iniciar sesion").located(By.xpath("//a[@id='login2']"));
    public static final Target TXT_USUARIO =
            Target.the("Usuario").located(By.xpath("//input[@id='loginusername']"));
    public static final Target TXT_PASS =
            Target.the("Constrasena").located(By.xpath("//input[@id='loginpassword']"));
    public static final Target BTN_LOGUEAR =
            Target.the("Iniciar logueo").located(By.xpath("//button[text()='Log in']"));
    public static final Target LBL_USUARIO =
            Target.the("Iniciar logueo").located(By.xpath("//a[@id='nameofuser']"));
}

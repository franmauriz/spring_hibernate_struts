package beans.actions;

import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name="success",location="/WEB-INF/content/bienvenido.jsp"),
    @Result(name="input",location="login",type = "redirectAction")
})
public class ValidarUsuarioAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);

    private String nombre;
    private String passWord;
    
    @Action("validarUsuario")
    public String execute() {
        if ("admin".equals(this.nombre)) {
            return SUCCESS;
        } else {
            return INPUT;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassword(String passWord) {
        this.passWord = passWord;
    }
}

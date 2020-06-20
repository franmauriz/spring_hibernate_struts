package beans.actions;

import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name="success",location="/WEB-INF/content/bienvenido.jsp"),
    @Result(name="input",location="/WEB-INF/content/login.jsp")
})
public class ValidarUsuarioAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);

    private String nombre;
    private String passWord;
    
    @Action("validarUsuario")
    public String execute() {
        if ("admin".equals(this.nombre)) {
            addActionMessage(getText("usuario.valido"));
            return SUCCESS;
        } else {
            return INPUT;
        }
    }
    
    @Override
    public void validate(){
        if(this.nombre == null || "".equals(this.nombre.trim())){
            addFieldError("nombre",getText("val.usuario"));
        }else if(!usuarioValido()){
            this.addActionError(getText("usuario.invalido"));
        }
        
        if(this.passWord == null || "".equals(this.passWord.trim())){
            addFieldError("password",getText("val.password"));
        }else if(this.passWord.length()<3){
            addFieldError("password",getText("password.invalido"));
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

    private boolean usuarioValido() {
        return "admin".equals(this.nombre);
    }
}

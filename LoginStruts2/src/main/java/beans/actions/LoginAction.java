package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String nombre;
    private String passWord;
    
    public String execute(){
        log.info("ejecutando metodo execute desde struts 2");
        return SUCCESS;
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
    
    public String getTitulo(){
        return getText("form.titulo");
    }
    
    public String getValores(){
        return getText("form.valores");
    }
    
    public String getBoton(){
        return getText("form.boton");
    }
    
    public String getUsuario(){
        return getText("form.usuario");
    }
    
     public String getPassword(){
        return getText("form.password");
    }
    
    
    
}

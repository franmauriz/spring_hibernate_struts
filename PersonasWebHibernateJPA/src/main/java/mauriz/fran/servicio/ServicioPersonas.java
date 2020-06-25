package mauriz.fran.servicio;

import java.util.List;
import mauriz.fran.dao.PersonaDAO;
import mauriz.fran.domain.Persona;

public class ServicioPersonas {
    private PersonaDAO personaDAO;
   
    
    public ServicioPersonas(){
        this.personaDAO = new PersonaDAO();
    }
    
    public List<Persona> listar(){
        return this.personaDAO.listar();
    }
}

package mauriz.fran.test;

import mauriz.fran.dao.PersonaDAO;
import mauriz.fran.domain.Persona;

public class PersonaDAOTest {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        personaDAO.listar();
        
        //Persona persona = new Persona("esther","jaime","esther@mail","789234123");
        Persona persona = new Persona();
        persona.setIdPersona(2);
        
        persona = personaDAO.buscarPersonaPorId(persona);
        //persona.setNombre("Esther");
//        persona.setApellido("Jaime");
//        persona.setEmail("esther@mail.com");
        //persona.setTelefono("234678986");
        
//        personaDAO.insertar(persona);
//          personaDAO.modificar(persona);
        personaDAO.eliminar(persona);
    }
}

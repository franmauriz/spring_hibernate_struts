package mauriz.fran.test;

import java.util.List;
import mauriz.fran.dao.AlumnoDao;
import mauriz.fran.dao.AsignacionDAO;
import mauriz.fran.dao.ContactoDAO;
import mauriz.fran.dao.CursoDAO;
import mauriz.fran.dao.DomicilioDAO;

public class TestDAO {

    public static void main(String[] args) {
        AlumnoDao alumnoDAO = new AlumnoDao();

        System.out.println("Alumnos:");

        imprimir(alumnoDAO.listar());

        DomicilioDAO domicilioDAO = new DomicilioDAO();
        System.out.println("Domicilios:");

        imprimir(domicilioDAO.listar());

        ContactoDAO contactoDAO = new ContactoDAO();
        System.out.println("Contactos:");

        imprimir(contactoDAO.listar());

        CursoDAO cursosDAO = new CursoDAO();
        System.out.println("Cursos:");

        imprimir(cursosDAO.listar());

        AsignacionDAO asignacionDAO = new AsignacionDAO();
        System.out.println("Asignaciones:");

        imprimir(asignacionDAO.listar());
    }

    private static void imprimir(List coleccion) {
        for (Object o : coleccion) {
            System.out.println("valor = " + o);
        }
    }
}

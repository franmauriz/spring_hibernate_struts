package mauriz.fran.servicio;

import java.util.List;
import mauriz.fran.dao.AlumnoDao;
import mauriz.fran.domain.Alumno;

public class ServicioAlumno {
    
    private AlumnoDao alumnoDAO = new AlumnoDao();
    
    public List<Alumno> listarAlumnos(){
        return alumnoDAO.listar();
    }
    
    
    public void guardarAlumno(Alumno alumno){
        if(alumno!=null && alumno.getIdAlumno() == null){
            alumnoDAO.insertar(alumno);
        }else{
            alumnoDAO.actualizar(alumno);
        }
    }
    
    public void eliminarAlumno(Alumno alumno){
        alumnoDAO.eliminar(alumno);
    }
    
    public Alumno encontrarPorId(Alumno alumno){
        return alumnoDAO.buscarPorId(alumno);
    }
}

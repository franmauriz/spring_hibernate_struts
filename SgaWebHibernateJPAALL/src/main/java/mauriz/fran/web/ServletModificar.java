package mauriz.fran.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mauriz.fran.domain.Alumno;
import mauriz.fran.servicio.ServicioAlumno;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idAlumnoS = request.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoS);
        
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);
        
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.encontrarPorId(alumno);

//        request.setAttribute("alumno", alumno);
        HttpSession session = request.getSession();
        session.setAttribute("alumno", alumno);
        
        request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String modificar = request.getParameter("Modificar");
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        
        if (modificar != null) {
            
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String calle = request.getParameter("calle");
            String noCalle = request.getParameter("noCalle");
            String pais = request.getParameter("pais");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");
            
            HttpSession sesion = request.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");
            
            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNoCalle(noCalle);
            alumno.getDomicilio().setPais(pais);
            alumno.getContacto().setEmail(email);
            alumno.getContacto().setTelefono(telefono);
            
            servicioAlumno.guardarAlumno(alumno);
            
            sesion.removeAttribute("alumno");
            
        } else {
            // caso para eliminar
            String idAlumnoS = request.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoS);
            Alumno alumno = new Alumno(idAlumno);
            
            servicioAlumno.eliminarAlumno(alumno);
        }
        
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

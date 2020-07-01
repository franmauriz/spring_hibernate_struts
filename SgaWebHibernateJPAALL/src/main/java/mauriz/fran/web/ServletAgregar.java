package mauriz.fran.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mauriz.fran.domain.Alumno;
import mauriz.fran.domain.Contacto;
import mauriz.fran.domain.Domicilio;
import mauriz.fran.servicio.ServicioAlumno;

@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) 
            throws ServletException, IOException{
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String calle = request.getParameter("calle");
        String noCalle = request.getParameter("noCalle");
        String pais = request.getParameter("pais");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setNoCalle(noCalle);
        domicilio.setPais(pais);
        
        Contacto contacto = new Contacto();
        contacto.setEmail(email);
        contacto.setTelefono(telefono);
        
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setContacto(contacto);
        alumno.setDomicilio(domicilio);
        
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        servicioAlumno.guardarAlumno(alumno);
        
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

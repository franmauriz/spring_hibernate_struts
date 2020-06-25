package mauriz.fran;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mauriz.fran.domain.Persona;
import mauriz.fran.servicio.ServicioPersonas;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            ServicioPersonas servicioPersonas = new ServicioPersonas();

            List<Persona> personas = servicioPersonas.listar();

            request.setAttribute("personas", personas);

            request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);
            
        } catch (ServletException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }
}

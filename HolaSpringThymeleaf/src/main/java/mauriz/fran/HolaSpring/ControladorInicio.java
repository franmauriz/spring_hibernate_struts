package mauriz.fran.HolaSpring;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import mauriz.fran.HolaSpring.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.mensajedos}")
    private String mensajeDos;
    
    @GetMapping("/")
    public String inicio(Model model){
        String mensaje = "Saludos desde el controlador con Model";
        var persona = new Persona();
        persona.setNombre("Fran");
        persona.setApellido("Mauriz");
        persona.setEmail("fran@gmail.com");
        persona.setTelefono("123456789");
        
        var personaDos = new Persona();
        personaDos.setNombre("Esther");
        personaDos.setApellido("Jaime");
        personaDos.setEmail("Jaime@gmail.com");
        personaDos.setTelefono("987654321");
        
//        var personas = new ArrayList();
//        personas.add(persona);
//        personas.add(personaDos);
        
        var personas = Arrays.asList(persona,personaDos);
        //var personas = new ArrayList();
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("mensajeDos",mensajeDos);
//        model.addAttribute("persona",persona);
        model.addAttribute("personas",personas);
        return "index";
    }
}

package mauriz.fran.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador rest");
        //log.debug("mas detalles del contralador");
        return "Hola Mundo con Spring";
    }
}

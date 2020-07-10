package mauriz.fran.HolaSpring.dao;

import mauriz.fran.HolaSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}

package mauriz.fran.HolaSpring.dao;

import mauriz.fran.HolaSpring.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}

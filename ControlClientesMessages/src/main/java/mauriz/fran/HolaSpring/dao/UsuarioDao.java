package mauriz.fran.HolaSpring.dao;

import mauriz.fran.HolaSpring.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}

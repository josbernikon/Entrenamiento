package aes.urjc.etsii.dad.holitamundito;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	ArrayList<Usuario> findByNombre (String Nombre);
	ArrayList<Usuario> findByNick   (String Nick);
}

package br.com.joaolira.lembreremedio.usuario.infra;

import br.com.joaolira.lembreremedio.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuraioSpringDataJPARepository extends JpaRepository <Usuario, UUID> {
}

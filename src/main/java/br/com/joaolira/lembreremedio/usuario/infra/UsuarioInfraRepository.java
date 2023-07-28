package br.com.joaolira.lembreremedio.usuario.infra;

import br.com.joaolira.lembreremedio.usuario.application.repository.UsuarioRepository;
import br.com.joaolira.lembreremedio.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
@RequiredArgsConstructor
public class UsuarioInfraRepository implements UsuarioRepository {
    private final UsuraioSpringDataJPARepository usuraioSpringDataJPARepository;
    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[incia] UsuarioInfraRepository - salva");
        usuraioSpringDataJPARepository.save(usuario);
        log.info("[finaliza] UsuarioInfraRepository - salva");
        return usuario;
    }
}

package br.com.joaolira.lembreremedio.usuario.application.service;

import br.com.joaolira.lembreremedio.usuario.application.api.UsuarioRequest;
import br.com.joaolira.lembreremedio.usuario.application.api.UsuarioResponse;
import br.com.joaolira.lembreremedio.usuario.application.repository.UsuarioRepository;
import br.com.joaolira.lembreremedio.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class UsuarioApplicationService implements UsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Override
    public UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest) {
        log.info("[inicia] UsuarioApplicationService - criaUsuario");
        Usuario usuario = usuarioRepository.salva(new Usuario(usuarioRequest));
        log.info("[inicia] finaliza - criaUsuario");
        return null;
    }
}

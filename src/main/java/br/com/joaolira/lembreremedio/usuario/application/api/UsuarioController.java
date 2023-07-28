package br.com.joaolira.lembreremedio.usuario.application.api;

import br.com.joaolira.lembreremedio.usuario.application.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class UsuarioController implements UsuarioAPI {
    private final UsuarioService usuarioService;

    @Override
    public UsuarioResponse postUsuario(UsuarioRequest usuarioRequest) {
        log.info("[inicia] UsuarioController - postCliente");
        UsuarioResponse usuarioCriado = usuarioService.criaUsuario(usuarioRequest);
        log.info("[finaliza] UsuarioController - postCliente");
        return usuarioCriado;
    }
}

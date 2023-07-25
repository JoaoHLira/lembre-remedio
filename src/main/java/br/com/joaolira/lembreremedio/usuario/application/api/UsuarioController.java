package br.com.joaolira.lembreremedio.usuario.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class UsuarioController implements UsuarioAPI {
    @Override
    public UsuarioResponse postCliente(UsuarioRequest usuarioRequest) {
        log.info("[inicia] UsuarioController - postCliente");
        log.info("[finaliza] UsuarioController - postCliente");
        return null;
    }
}

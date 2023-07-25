package br.com.joaolira.lembreremedio.usuario.application.service;

import br.com.joaolira.lembreremedio.usuario.application.api.UsuarioRequest;
import br.com.joaolira.lembreremedio.usuario.application.api.UsuarioResponse;

public interface UsuarioService {

    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);
}

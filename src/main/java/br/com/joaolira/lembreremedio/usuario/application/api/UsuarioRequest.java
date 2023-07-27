package br.com.joaolira.lembreremedio.usuario.application.api;

import br.com.joaolira.lembreremedio.usuario.domain.Usuario;
import lombok.Value;

@Value
public class UsuarioRequest {

    private String nomeCompleto;
    private String email;

}

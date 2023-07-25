package br.com.joaolira.lembreremedio.usuario.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class UsuarioResponse {
    private UUID idUsuario;
}

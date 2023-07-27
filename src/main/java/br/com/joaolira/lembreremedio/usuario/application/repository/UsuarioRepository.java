package br.com.joaolira.lembreremedio.usuario.application.repository;

import br.com.joaolira.lembreremedio.usuario.domain.Usuario;

public interface UsuarioRepository {
    Usuario salva(Usuario usuario);
}

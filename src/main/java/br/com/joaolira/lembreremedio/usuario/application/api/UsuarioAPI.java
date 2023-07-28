package br.com.joaolira.lembreremedio.usuario.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/usuario")
public interface UsuarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    UsuarioResponse postUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest);
}

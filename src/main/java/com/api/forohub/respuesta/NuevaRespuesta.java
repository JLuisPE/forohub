package com.api.forohub.respuesta;

import com.api.forohub.topico.Topico;
import com.api.forohub.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record NuevaRespuesta(@NotNull
                             String mensaje,
                             Topico topico,
                             LocalDateTime fechaCreacion,
                             Usuario usuario,
                             String solucion) {
}

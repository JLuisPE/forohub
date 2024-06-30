package com.api.forohub.respuesta;

import com.api.forohub.topico.Topico;
import com.api.forohub.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosRespuesta(Long id,
                             String mensaje,
                             LocalDateTime fechaCreacion) {
}

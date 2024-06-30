package com.api.forohub.respuesta;

import java.time.LocalDateTime;

public record DatosRespuesta(Long id,
                             String mensaje,
                             LocalDateTime fechaCreacion) {
}

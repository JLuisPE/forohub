package com.api.forohub.respuesta;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ActualizarRespuesta(@NotNull Long id,
                                  String mensaje,
                                  String solucion) {
}

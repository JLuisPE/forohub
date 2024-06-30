package com.api.forohub.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ActualizarTopico(@NotNull Long id,
                               String titulo,
                               String mensaje,
                               String status) {
}

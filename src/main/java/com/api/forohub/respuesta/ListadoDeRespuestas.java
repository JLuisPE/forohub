package com.api.forohub.respuesta;

import java.time.LocalDateTime;

public record ListadoDeRespuestas(Long id,
                                  String mensaje,
                                  LocalDateTime fechaCreacion) {

    public ListadoDeRespuestas(Respuesta respuesta){
        this(respuesta.getId(), respuesta.getMensaje(), respuesta.getFechaCreacion());
    }
}

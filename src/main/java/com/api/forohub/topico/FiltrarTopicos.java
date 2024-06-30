package com.api.forohub.topico;

import java.time.LocalDateTime;

public class FiltrarTopicos {
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private Long autorId;
    private Long cursoId;
    private String cursoNombre;

    // Constructor que inicializa todos los campos
    public FiltrarTopicos(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, Long autorId, Long cursoId, String cursoNombre) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaCreacion = fechaCreacion;
        this.autorId = autorId;
        this.cursoId = cursoId;
        this.cursoNombre = cursoNombre;
    }

    // Getters y setters (si es necesario)
}

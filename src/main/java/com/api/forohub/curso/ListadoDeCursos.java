package com.api.forohub.curso;

public record ListadoDeCursos(Long id,
                              String nombre,
                              String categoria) {

    public ListadoDeCursos(Curso curso){
        this(curso.getId(), curso.getNombre(), curso.getCategoria());
    }
}

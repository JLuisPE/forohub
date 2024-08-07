package com.api.forohub.respuesta;

import com.api.forohub.topico.Topico;
import com.api.forohub.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "Respuesta")
@Table(name = "respuestas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensaje;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topico_id")
    private Topico topico;

    @Column(name = "fecha_Creacion")
    private LocalDateTime fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    private Boolean solucion;

    public Respuesta(NuevaRespuesta nuevaRespuesta) {
        this.mensaje = nuevaRespuesta.mensaje();
        this.topico = nuevaRespuesta.topico();
        this.fechaCreacion = LocalDateTime.now();
        this.autor = nuevaRespuesta.usuario();
        this.solucion = true;
    }

    public void actualizarDeRespuesta(ActualizarRespuesta actualizarRespuesta) {
        if (actualizarRespuesta.mensaje() != null) {
            this.mensaje = actualizarRespuesta.mensaje();
        }
    }

    public void desactivarTopico() {
        this.solucion = false;
    }
}

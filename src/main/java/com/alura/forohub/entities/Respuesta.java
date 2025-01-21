package com.alura.forohub.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "respuestas")
public class Respuesta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 2000)
    private String mensaje;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;

    private Boolean solucion;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "topico_id", nullable = false)
    private Topico topico;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Users autor;

    public Respuesta() {
    }

    public Respuesta(String mensaje, LocalDate fechaCreacion, Boolean solucion, Topico topico, Users autor) {
        this.mensaje = mensaje;
        this.fechaCreacion = fechaCreacion;
        this.solucion = solucion;
        this.topico = topico;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getSolucion() {
        return solucion;
    }

    public void setSolucion(Boolean solucion) {
        this.solucion = solucion;
    }

    public Topico getTopico() {
        return topico;
    }

    public void setTopico(Topico topico) {
        this.topico = topico;
    }

    public Users getAutor() {
        return autor;
    }

    public void setAutor(Users autor) {
        this.autor = autor;
    }
}

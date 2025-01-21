package com.alura.forohub.dtos;

import com.alura.forohub.entities.Curso;
import com.alura.forohub.entities.Respuesta;
import com.alura.forohub.entities.Users;
import java.time.LocalDate;
import java.util.List;

public class TopicoDTO {
    private int id;
    private String titulo;
    private String mensaje;
    private LocalDate fechaCreacion;
    private String status;
    private Users autor;
    private Curso curso;
    private List<RespuestaDTO> respuestas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Users getAutor() {
        return autor;
    }

    public void setAutor(Users autor) {
        this.autor = autor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<RespuestaDTO> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<RespuestaDTO> respuestas) {
        this.respuestas = respuestas;
    }
}

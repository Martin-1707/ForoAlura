package com.alura.forohub.dtos;

import com.alura.forohub.entities.Topico;
import com.alura.forohub.entities.Users;

import java.time.LocalDate;

public class RespuestaDTO {
    private int id;
    private String mensaje;
    private LocalDate fechaCreacion;
    private Boolean solucion;

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

}

package com.alura.forohub.dtos;

public class UserDTO {
    private int IdUsario;
    private String  nombre;
    private String  email;
    private String username;
    private String password;
    private Boolean enabled;

    public int getIdUsario() {
        return IdUsario;
    }

    public void setIdUsario(int idUsario) {
        IdUsario = idUsario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}

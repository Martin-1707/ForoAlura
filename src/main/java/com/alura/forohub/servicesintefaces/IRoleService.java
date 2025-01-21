package com.alura.forohub.servicesintefaces;


import com.alura.forohub.entities.Role;

import java.util.List;

public interface IRoleService {
    //Create
    public void insert(Role rol);
    //Read
    public List<Role> list();
    //Update
    public Role listarId(Long idRol);
    //Delete
    public void delete(Long idRol);

}

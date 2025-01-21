package com.alura.forohub.servicesintefaces;



import com.alura.forohub.entities.Users;

import java.util.List;

public interface IUserService {
    //Create
    public void insert(Users usuario);
    //Read
    public List<Users> list();
    //Update
    public void update(Users usuario);
    //Delete
    public void delete(int id);

    //Listar por id
    public Users listarId(int idUsuario);


}

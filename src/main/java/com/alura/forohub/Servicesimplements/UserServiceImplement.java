package com.alura.forohub.Servicesimplements;

import com.alura.forohub.entities.Users;
import com.alura.forohub.repositories.IUserRepository;
import com.alura.forohub.servicesintefaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(Users usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public void update(Users usuario) {
        uR.save(usuario);
    }


    @Override
    public Users listarId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Users());
    }

}

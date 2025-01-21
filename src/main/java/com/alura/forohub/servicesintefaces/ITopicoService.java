package com.alura.forohub.servicesintefaces;

import com.alura.forohub.entities.Topico;

import java.util.List;

public interface ITopicoService {
    //Create
    public void insert(Topico topico);
    //Read
    public List<Topico> list();
    //Update
    public void update(Topico topico);
    //Delete
    public void delete(int id);
    //ListarId
    public Topico listarId(int id);
}

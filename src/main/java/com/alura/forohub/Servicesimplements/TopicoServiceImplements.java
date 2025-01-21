package com.alura.forohub.Servicesimplements;

import com.alura.forohub.entities.Topico;
import com.alura.forohub.repositories.ITopicoRepository;
import com.alura.forohub.servicesintefaces.ITopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoServiceImplements implements ITopicoService {

    @Autowired
    private ITopicoRepository tR;

    @Override
    public void insert(Topico topico) {
        tR.save(topico);
    }

    @Override
    public List<Topico> list() {
        return tR.findAll();
    }

    @Override
    public void update(Topico topico) {
        tR.save(topico);
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public Topico listarId(int id) {
        return tR.findById(id).orElse(new Topico());
    }
}

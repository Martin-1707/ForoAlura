package com.alura.forohub.Servicesimplements;

import com.alura.forohub.entities.Curso;
import com.alura.forohub.repositories.ICursoRepository;
import com.alura.forohub.servicesintefaces.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImplements implements ICursoService {

    @Autowired
    private ICursoRepository cR;

    @Override
    public void insert(Curso curso) {
        cR.save(curso);
    }
}
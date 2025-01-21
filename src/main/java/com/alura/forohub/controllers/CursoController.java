package com.alura.forohub.controllers;

import com.alura.forohub.dtos.CursoDTO;
import com.alura.forohub.entities.Curso;
import com.alura.forohub.servicesintefaces.ICursoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private ICursoService cS;

    @PostMapping
    public void registrar(@RequestBody CursoDTO dto) {
        ModelMapper m = new ModelMapper();
        Curso t = m.map(dto, Curso.class);
        cS.insert(t);
    }
}

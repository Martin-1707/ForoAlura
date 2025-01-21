package com.alura.forohub.Servicesimplements;

import com.alura.forohub.entities.Respuesta;
import com.alura.forohub.entities.Topico;
import com.alura.forohub.repositories.IRespuestaRepository;
import com.alura.forohub.repositories.ITopicoRepository;
import com.alura.forohub.servicesintefaces.IRespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaServiceImplements implements IRespuestaService {

    @Autowired
    private IRespuestaRepository rR;

    @Override
    public void insert(Respuesta respuesta) {
        rR.save(respuesta);
    }
}

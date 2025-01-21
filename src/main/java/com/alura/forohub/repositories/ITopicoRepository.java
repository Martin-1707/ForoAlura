package com.alura.forohub.repositories;

import com.alura.forohub.entities.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ITopicoRepository extends JpaRepository<Topico, Integer> {
    Optional<Topico> findByTituloAndMensaje(String titulo, String mensaje);
}

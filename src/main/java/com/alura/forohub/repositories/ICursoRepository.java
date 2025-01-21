package com.alura.forohub.repositories;

import com.alura.forohub.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso, Integer> {
}

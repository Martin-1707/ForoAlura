package com.alura.forohub.repositories;

import com.alura.forohub.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {
    public Users findOneByUsername(String username);


}
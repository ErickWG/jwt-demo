package com.com.jwtdemo.repository;

import com.com.jwtdemo.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {
    @Query(value = "SELECT id, name from pais where name = :1", nativeQuery = true)
    List<Pais> listaPorNombre (String nombre);

    List<Pais> findByUsername (String nombre);

}

package com.com.jwtdemo.service;

import com.com.jwtdemo.model.Pais;
import com.com.jwtdemo.repository.PaisRepository;
import org.hibernate.annotations.NotFound;
import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {
    private final PaisRepository paisRepository;

    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    public List<Pais> lista() {
        return paisRepository.findAll();
    }
    public Pais inserta (Pais pais) {
        return paisRepository.save(pais);
    }
    public Pais listaPorId(Integer id) {
        return paisRepository.findById(id)
                .orElseThrow(() -> new OpenApiResourceNotFoundException("Id not found: "+ id));
    }

}

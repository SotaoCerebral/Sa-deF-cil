package com.appweb.saudefacil.service;

import com.appweb.saudefacil.medico.DadosCadastroMedicoDTO;
import com.appweb.saudefacil.medico.Medico;
import com.appweb.saudefacil.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {
    @Autowired
    private MedicoRepository repository;
    public Medico create(DadosCadastroMedicoDTO dados){
        Medico medico = new Medico(dados);
        return repository.save(medico);
    }

    public List<Medico> listar(){

        return repository.findAll();
    }
}

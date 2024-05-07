package com.appweb.saudefacil.controller;

import com.appweb.saudefacil.medico.DadosCadastroMedicoDTO;
import com.appweb.saudefacil.medico.Medico;
import com.appweb.saudefacil.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService service;
    @PostMapping
    public ResponseEntity<Medico> create(@RequestBody  DadosCadastroMedicoDTO dados){
        return ResponseEntity.ok().body(service.create(dados));
    }
    @GetMapping
    public ResponseEntity<List<Medico>> listar(){
        return ResponseEntity.ok().body(service.listar());
    }
}

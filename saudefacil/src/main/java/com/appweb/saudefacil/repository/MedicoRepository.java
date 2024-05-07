package com.appweb.saudefacil.repository;

import com.appweb.saudefacil.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico,Long> {
}

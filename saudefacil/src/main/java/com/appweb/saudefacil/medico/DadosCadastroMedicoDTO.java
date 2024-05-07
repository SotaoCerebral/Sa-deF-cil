package com.appweb.saudefacil.medico;

import com.appweb.saudefacil.endereco.Endereco;
import com.appweb.saudefacil.endereco.EnderecoDTO;

public record DadosCadastroMedicoDTO(String nome, String email, String telefone, String crm, Especialidade especialidade, EnderecoDTO endereco ) {



}

package com.pedrodiogenes.buscaCep.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CepRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String regiao;
    // p
}
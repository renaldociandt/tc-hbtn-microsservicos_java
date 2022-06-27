package com.example.jpah2demo;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String idade;
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "telefones_id")
    private List<Telefone> telefones = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "enderecos_id")
    private List<Endereco> enderecos = new ArrayList<>();

}

package com.calegari.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;;

@Entity
public class Selecao implements Serializable{
    
    public Selecao(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    @Id
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "selecao")
    private List<Jogador> jogadores = new ArrayList<Jogador>();

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

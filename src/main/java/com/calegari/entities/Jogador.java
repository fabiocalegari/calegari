package com.calegari.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Jogador implements Serializable{
    @Id
    private Long id;
    private String nome;
    private Integer numero;
    private Integer pagina;
    private Selecao selecao;

    public Jogador(Long id, String nome, Integer numero, Integer pagina) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.pagina = pagina;
    }
    
    @ManyToOne
    @JoinColumn(name = "selecao_id")
    public Selecao getSelecao() {
        return selecao;
    }
    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Integer getPagina() {
        return pagina;
    }
    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }
    
}

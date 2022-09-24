package com.calegari.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.calegari.entities.Selecao;

@Component
public class SelecaoRepository {

    private Map<Long, Selecao> selecoes = new HashMap<>();

    public void save(Selecao selecao){
        selecoes.put(selecao.getId(), selecao);
    }

    public List<Selecao> findAll(){
        return new ArrayList<Selecao>(selecoes.values());
    }
    
}

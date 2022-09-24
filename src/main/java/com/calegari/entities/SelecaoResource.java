package com.calegari.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calegari.repositories.SelecaoRepository;

import net.minidev.json.JSONObject;

@RestController
@RequestMapping(value = "/selecao")
public class SelecaoResource {

    @Autowired
    SelecaoRepository selecaoRepository;

    @GetMapping
    public ResponseEntity<List<Selecao>> findAll(){
        List<Selecao> selecoes = selecaoRepository.findAll();
        return ResponseEntity.ok().body(selecoes);
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Selecao> create(@RequestBody JSONObject selecao){
        Long id = Long.parseLong(selecao.getAsString("id"));
        String nome = selecao.getAsString("nome");
        Selecao newSelecao = new Selecao(id, nome);
        selecaoRepository.save(newSelecao);
        return ResponseEntity.ok().body(newSelecao);
    }

}

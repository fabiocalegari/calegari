package com.calegari;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.calegari.entities.Jogador;
import com.calegari.entities.Selecao;
import com.calegari.repositories.SelecaoRepository;



@SpringBootApplication
public class CalegariApplication implements CommandLineRunner{

	@Autowired
	SelecaoRepository selecaoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CalegariApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Selecao brasil = new Selecao(1L, "Brasil");
		Jogador jogador1 = new Jogador(1L, "Joao", 1, 1);
		Jogador jogador2 = new Jogador(2L, "Paulo", 2, 1);
		Jogador jogador3 = new Jogador(3L, "Jose", 3, 1);
		List<Jogador> jogadores = new ArrayList<>();
		jogadores.add(jogador1);
		jogadores.add(jogador2);
		jogadores.add(jogador3);
		brasil.setJogadores(jogadores);
		
		selecaoRepository.save(brasil);
		
	}

}

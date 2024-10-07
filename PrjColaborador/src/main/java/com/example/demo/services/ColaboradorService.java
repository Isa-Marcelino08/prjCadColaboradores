package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Colaborador;
import com.example.demo.repositories.ColaboradorRepository;

@Service
public class ColaboradorService {

	private final ColaboradorRepository colaboradorrepository;
	
	@Autowired
	public ColaboradorService (ColaboradorRepository colaboradorrepository) {
		this.colaboradorrepository = colaboradorrepository;
	}
	
	//CRIAÇÃO DO PRODUTO
	
	public Colaborador saveColaborador(Colaborador colaborador) {
		return colaboradorrepository.save(colaborador);
	}
	
	//BUSCAR PRODUTO 
	public Colaborador getColaboradorById(long id) {
		return colaboradorrepository.findById(id).orElse(null);
	}
	
	//PROCURAR TODOS OS PRODUTOS
	public List<Colaborador> getAllColaborador(){
		return colaboradorrepository.findAll();
	}
	
	// EXCLUIR OS PRODUTOS
	public void deletColaborador(long id) {
		colaboradorrepository.deleteById(id);
	}
	
	
	
}

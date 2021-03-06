package com.edson.app.produtos.models.services;

import java.util.List;

import com.edson.app.commons.models.entities.Produto;

public interface ProdutoService {
	public List<Produto> findAll();
	public Produto findById(Long id);
	public Produto save(Produto produto);
	public void deleteById(Long id);
}

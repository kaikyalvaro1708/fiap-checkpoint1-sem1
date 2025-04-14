package br.com.fiap.checkpoint1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.dto.ProdutoRequestCreate;
import br.com.fiap.checkpoint1.dto.ProdutoRequestUpdate;
import br.com.fiap.checkpoint1.model.Produto;
import br.com.fiap.checkpoint1.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(ProdutoRequestCreate dto) {

        Produto produto = new Produto();
        produto.setNome(dto.getNome());

        return produtoRepository.save(produto);

    }

    public Optional<Produto> update(Long Id, ProdutoRequestUpdate dto) {
        return produtoRepository.findById(Id).map(produto -> {
            produto.setNome(dto.getNome());
            return produtoRepository.save(produto);
        });
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Produto findById(Long id) {
        Optional<Produto> opt = produtoRepository.findById(id);

        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }

}
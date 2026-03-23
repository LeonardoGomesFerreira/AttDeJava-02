package com.Att.Gerenciamento.de.Produtos.controller;

import com.Att.Gerenciamento.de.Produtos.entity.Produto;
import com.Att.Gerenciamento.de.Produtos.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    // POST /produtos
    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    // GET /produtos
    @GetMapping
    public List<Produto> listar() {
        return service.listarTodos();
    }

    // GET /produtos/{id}
    @GetMapping("/{id}")
    public Optional<Produto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // DELETE /produtos/{id}
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
package com.Att.Gerenciamento.de.Produtos.repository;

import com.Att.Gerenciamento.de.Produtos.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
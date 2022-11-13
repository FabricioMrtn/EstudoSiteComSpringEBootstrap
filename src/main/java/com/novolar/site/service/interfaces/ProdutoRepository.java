package com.novolar.site.service.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novolar.site.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{}

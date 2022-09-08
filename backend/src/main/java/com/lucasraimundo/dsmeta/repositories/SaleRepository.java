package com.lucasraimundo.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasraimundo.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}

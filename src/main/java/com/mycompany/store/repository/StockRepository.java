package com.mycompany.store.repository;

import com.mycompany.store.domain.Stock;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Stock entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {}

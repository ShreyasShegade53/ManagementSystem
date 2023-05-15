package com.mycompany.store.repository;

import com.mycompany.store.domain.PurchaseProduct;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the PurchaseProduct entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PurchaseProductRepository extends JpaRepository<PurchaseProduct, Long> {}

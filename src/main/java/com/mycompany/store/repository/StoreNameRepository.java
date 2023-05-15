package com.mycompany.store.repository;

import com.mycompany.store.domain.StoreName;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the StoreName entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StoreNameRepository extends JpaRepository<StoreName, Long> {}

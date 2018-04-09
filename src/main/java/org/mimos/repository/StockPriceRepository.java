package org.mimos.repository;

import org.mimos.domain.StockPrice;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the StockPrice entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Long> {

}

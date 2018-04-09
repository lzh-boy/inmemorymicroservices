package org.mimos.repository;

import org.mimos.domain.StockInfo;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the StockInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StockInfoRepository extends JpaRepository<StockInfo, Long> {

}

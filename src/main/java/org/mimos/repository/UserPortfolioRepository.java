package org.mimos.repository;

import org.mimos.domain.UserPortfolio;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the UserPortfolio entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UserPortfolioRepository extends JpaRepository<UserPortfolio, Long> {

}

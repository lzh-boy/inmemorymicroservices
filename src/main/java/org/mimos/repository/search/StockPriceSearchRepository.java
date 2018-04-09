package org.mimos.repository.search;

import org.mimos.domain.StockPrice;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the StockPrice entity.
 */
public interface StockPriceSearchRepository extends ElasticsearchRepository<StockPrice, Long> {
}

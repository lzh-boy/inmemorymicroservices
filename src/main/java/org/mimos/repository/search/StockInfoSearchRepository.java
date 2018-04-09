package org.mimos.repository.search;

import org.mimos.domain.StockInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the StockInfo entity.
 */
public interface StockInfoSearchRepository extends ElasticsearchRepository<StockInfo, Long> {
}

package org.mimos.repository.search;

import org.mimos.domain.Sector;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Sector entity.
 */
public interface SectorSearchRepository extends ElasticsearchRepository<Sector, Long> {
}

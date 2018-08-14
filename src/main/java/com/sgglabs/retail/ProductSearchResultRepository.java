package com.sgglabs.retail;

import com.sgglabs.retail.model.ProductSearchResult;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSearchResultRepository extends MongoRepository<ProductSearchResult, Long> {
}

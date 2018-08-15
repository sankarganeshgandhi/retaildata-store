package com.sgglabs.retail;

import com.sgglabs.retail.model.SellerProductData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerProductDataRepository extends MongoRepository<SellerProductData, Long> {
}

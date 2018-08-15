package com.sgglabs.retail;

import com.sgglabs.retail.model.doc.SellerProductData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerProductDataRepository extends MongoRepository<SellerProductData, Long> {
}

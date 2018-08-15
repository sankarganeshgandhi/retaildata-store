package com.sgglabs.retail;

import com.sgglabs.retail.model.ProductSearchResult;
import com.sgglabs.retail.model.SellerProductData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);
    private static final String SEQUENCE_NAME = "customsequence";

    @Autowired
    CustomSequenceService sequenceGenerator;

    @Autowired
    ProductSearchResultRepository searchResultRepo;

    @Autowired
    SellerProductDataRepository sellerDataRepo;

    @JmsListener(destination = "SearchResultQ", containerFactory = "jmsFactory")
    public void receiveMessage(ProductSearchResultDTO searchResultDTO) {
        SellerProductDataDTO sellerDataDTO = searchResultDTO.getSellerData();
        SellerProductData sellerDataEntity = getEntity(sellerDataDTO);
        sellerDataRepo.save(sellerDataEntity);

        ProductSearchResult productSearchResultEntity = getEntity(searchResultDTO);
        productSearchResultEntity.setId(sequenceGenerator.getNextSequence(SEQUENCE_NAME));
        productSearchResultEntity.setSellerDataId(sellerDataEntity.getId());
        searchResultRepo.save(productSearchResultEntity);
    }

    private ProductSearchResult getEntity(ProductSearchResultDTO dto) {
        ProductSearchResult entity = new ProductSearchResult();
        entity.setId(sequenceGenerator.getNextSequence(SEQUENCE_NAME));
        entity.setSearchText(dto.getSearchText());
        entity.setShortDescription(dto.getShortDescription());
        entity.setLongDescription(dto.getLongDescription());
        entity.setPrice(dto.getPrice());
        entity.setUnit(dto.getUnit());
        entity.setNumberOfReviews(dto.getNumberOfReviews());
        entity.setTotalRatings(dto.getTotalRatings());
        entity.setOtherOptions(dto.getOtherOptions());
        entity.setCategories(dto.getCategories());
        entity.setStatus(dto.getStatus());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setModifiedDate(dto.getModifiedDate());
        return entity;
    }

    private SellerProductData getEntity(SellerProductDataDTO dto) {
        SellerProductData entity = new SellerProductData();
        entity.setId(sequenceGenerator.getNextSequence(SEQUENCE_NAME));
        entity.setSellerName(dto.getSellerName());
        entity.setRatingIndex(dto.getRatingIndex());
        entity.setTotalRatings(dto.getTotalRatings());
        entity.setDetails(dto.getDetails());
        entity.setBasePrice(dto.getBasePrice());
        entity.setTotalPrice(dto.getTotalPrice());
        entity.setStatus(dto.getStatus());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setModifiedDate(dto.getModifiedDate());
        return entity;
    }
}
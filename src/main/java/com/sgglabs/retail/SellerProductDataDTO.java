package com.sgglabs.retail;

import java.util.Date;
import java.util.Objects;

public class SellerProductDataDTO {
    private static final String TO_STRING_FORMAT =
            "SellerProductData[id=%s, sellerName='%s', ratingIndex='%s', totalRatings='%s', " +
                    "details='%s', basePrice='%s', totalPrice='%s', status='%s', createdDate=%s, modifiedDate=%s]";
    private int id;

    private String sellerName;

    private String ratingIndex;

    private String totalRatings;

    private String details;

    private String basePrice;

    private String totalPrice;

    private String status;

    private Date createdDate;

    private Date modifiedDate;

    public SellerProductDataDTO() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getRatingIndex() {
        return ratingIndex;
    }

    public void setRatingIndex(String ratingIndex) {
        this.ratingIndex = ratingIndex;
    }

    public String getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(String numberOfRatings) {
        this.totalRatings = numberOfRatings;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellerProductDataDTO that = (SellerProductDataDTO) o;
        return id == that.id &&
                Objects.equals(status, that.status) &&
                Objects.equals(sellerName, that.sellerName) &&
                Objects.equals(ratingIndex, that.ratingIndex) &&
                Objects.equals(totalRatings, that.totalRatings) &&
                Objects.equals(details, that.details) &&
                Objects.equals(basePrice, that.basePrice) &&
                Objects.equals(totalPrice, that.totalPrice) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(modifiedDate, that.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sellerName, ratingIndex, totalRatings, details,
                basePrice, totalPrice, status, createdDate, modifiedDate);
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_FORMAT, id, sellerName, ratingIndex, totalRatings,
                details, basePrice, totalPrice, status, createdDate, modifiedDate);
    }
}
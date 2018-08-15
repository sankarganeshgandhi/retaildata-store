package com.sgglabs.retail;

import java.util.Date;
import java.util.Objects;

public class ProductSearchResultDTO {
    private static final String TO_STRING_FORMAT =
            "ProductSearchResult[id=%s, siteName='%s', searchText='%s', shortDesc='%s', longDesc='%s', price='%s'" +
                    "unit='%s', reviews='%s', ratings='%s', otherOptions='%s', prodCategories='%s'" +
                    "statusId=%s, createdDate=%s, modifiedDate=%s, sellerData=%s]";

    private long id;

    private String siteName;

    private String searchText;

    private String shortDescription;

    private String longDescription;

    private String price;

    private String unit;

    private String numberOfReviews;

    private String totalRatings;

    private String otherOptions;

    private String categories;

    private String status;

    private Date createdDate;

    private Date modifiedDate;

    private SellerProductDataDTO sellerData;

    public ProductSearchResultDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(String numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public String getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(String ratings) {
        this.totalRatings = ratings;
    }

    public String getOtherOptions() {
        return otherOptions;
    }

    public void setOtherOptions(String otherOptions) {
        this.otherOptions = otherOptions;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
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

    public SellerProductDataDTO getSellerData() {
        return sellerData;
    }

    public void setSellerData(SellerProductDataDTO sellerData) {
        this.sellerData = sellerData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSearchResultDTO that = (ProductSearchResultDTO) o;
        return id == that.id &&
                Objects.equals(sellerData, that.sellerData) &&
                Objects.equals(siteName, that.siteName) &&
                Objects.equals(searchText, that.searchText) &&
                Objects.equals(shortDescription, that.shortDescription) &&
                Objects.equals(longDescription, that.longDescription) &&
                Objects.equals(price, that.price) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(numberOfReviews, that.numberOfReviews) &&
                Objects.equals(totalRatings, that.totalRatings) &&
                Objects.equals(otherOptions, that.otherOptions) &&
                Objects.equals(categories, that.categories) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(modifiedDate, that.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, siteName, searchText, shortDescription, longDescription, price, unit, numberOfReviews,
                totalRatings, otherOptions, categories, status, createdDate, modifiedDate, sellerData);
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_FORMAT, id, siteName, searchText, shortDescription, longDescription, price, unit,
                numberOfReviews, totalRatings, otherOptions, categories, status, createdDate, modifiedDate,
                sellerData);
    }
}
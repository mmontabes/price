package com.example.prices.interfaces.rest.dtos;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PriceResponse
 */
@lombok.AllArgsConstructor @lombok.Builder @lombok.NoArgsConstructor

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-26T12:38:25.695626100+02:00[Europe/Madrid]")
public class PriceResponse   {

  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("brandId")
  private Integer brandId;

  @JsonProperty("priceList")
  private BigDecimal priceList;

  @JsonProperty("applicationDate")
  @Valid
  private List<LocalDate> applicationDate = null;

  @JsonProperty("price")
  private BigDecimal price;

  public PriceResponse productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "productId", required = false)
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public PriceResponse brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
  */
  
  @Schema(name = "brandId", required = false)
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public PriceResponse priceList(BigDecimal priceList) {
    this.priceList = priceList;
    return this;
  }

  /**
   * Get priceList
   * @return priceList
  */
  @Valid 
  @Schema(name = "priceList", required = false)
  public BigDecimal getPriceList() {
    return priceList;
  }

  public void setPriceList(BigDecimal priceList) {
    this.priceList = priceList;
  }

  public PriceResponse applicationDate(List<LocalDate> applicationDate) {
    this.applicationDate = applicationDate;
    return this;
  }

  public PriceResponse addApplicationDateItem(LocalDate applicationDateItem) {
    if (this.applicationDate == null) {
      this.applicationDate = new ArrayList<>();
    }
    this.applicationDate.add(applicationDateItem);
    return this;
  }

  /**
   * Get applicationDate
   * @return applicationDate
  */
  @Valid 
  @Schema(name = "applicationDate", required = false)
  public List<LocalDate> getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(List<LocalDate> applicationDate) {
    this.applicationDate = applicationDate;
  }

  public PriceResponse price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", required = false)
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceResponse priceResponse = (PriceResponse) o;
    return Objects.equals(this.productId, priceResponse.productId) &&
        Objects.equals(this.brandId, priceResponse.brandId) &&
        Objects.equals(this.priceList, priceResponse.priceList) &&
        Objects.equals(this.applicationDate, priceResponse.applicationDate) &&
        Objects.equals(this.price, priceResponse.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, brandId, priceList, applicationDate, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceResponse {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


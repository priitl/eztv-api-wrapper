package com.priitlaht.eztvapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

import lombok.Data;

/**
 * @author Priit Laht
 */
@Data
public class Rating {
  @JsonProperty(value = "votes")
  private int votes;
  @JsonProperty(value = "loved")
  private int loved;
  @JsonProperty(value = "hated")
  private int hated;
  @JsonProperty(value = "percentage")
  private BigDecimal percentage;
}

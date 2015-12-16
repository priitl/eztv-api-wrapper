package com.priitlaht.eztvapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Priit Laht
 */
@Data
public class Watched {
  @JsonProperty(value = "watched")
  private boolean isWatched;
}


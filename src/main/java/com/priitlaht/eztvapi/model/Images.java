package com.priitlaht.eztvapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Priit Laht
 */
@Data
public class Images {
  @JsonProperty(value = "poster")
  private String posterUrl;
  @JsonProperty(value = "fanart")
  private String fanArtUrl;
  @JsonProperty(value = "banner")
  private String bannerUrl;
}

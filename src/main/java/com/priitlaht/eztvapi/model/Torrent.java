package com.priitlaht.eztvapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Priit Laht
 */
@Data
public class Torrent {
  @JsonProperty(value = "peers")
  private String peers;
  @JsonProperty(value = "seeds")
  private String seeds;
  @JsonProperty(value = "url")
  private String magnetUri;
}

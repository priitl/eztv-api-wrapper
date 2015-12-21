package com.priitlaht.eztvapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Priit Laht
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TvShowDetails extends TvShow {
  @JsonProperty(value = "synopsis")
  private String synopsis;
  @JsonProperty(value = "episodes")
  private List<Episode> episodes;
  @JsonProperty(value = "genres")
  private List<String> genres;
  @JsonProperty(value = "status")
  private String status;
  @JsonProperty(value = "runtime")
  private int runtime;
  @JsonProperty(value = "air_day")
  private String airDay;
  @JsonProperty(value = "air_time")
  private String airTime;
  @JsonProperty(value = "network")
  private String network;
  @JsonProperty(value = "country")
  private String country;
  @JsonProperty(value = "rating")
  private Rating rating;
  @JsonProperty(value = "__v")
  private int version;
}

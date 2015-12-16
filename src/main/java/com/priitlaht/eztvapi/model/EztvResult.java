package com.priitlaht.eztvapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.priitlaht.eztvapi.util.UnixTimestampDeserializer;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @author Priit Laht
 */
@Data
public class EztvResult {
  @JsonProperty(value = "_id")
  private String showId;
  @JsonProperty(value = "title")
  private String title;
  @JsonProperty(value = "synopsis")
  private String synopsis;
  @JsonProperty(value = "num_seasons")
  private int numberOfSeasons;
  @JsonProperty(value = "episodes")
  private List<Episode> episodes;
  @JsonProperty(value = "genres")
  private List<String> genres;
  @JsonProperty(value = "images")
  private Images images;
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
  @JsonProperty(value = "year")
  private String year;
  @JsonProperty(value = "rating")
  private Rating rating;
  @JsonProperty(value = "imdb_id")
  private String imdbId;
  @JsonProperty(value = "tvdb_id")
  private String tvdbId;
  @JsonProperty(value = "slug")
  private String slug;
  @JsonProperty(value = "last_updated")
  @JsonDeserialize(using = UnixTimestampDeserializer.class)
  private Date lastUpdated;
  @JsonProperty(value = "__v")
  private int version;
}

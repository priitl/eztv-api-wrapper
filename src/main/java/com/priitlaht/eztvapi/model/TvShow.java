package com.priitlaht.eztvapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.priitlaht.eztvapi.util.UnixTimestampDeserializer;

import java.util.Date;

import lombok.Data;

/**
 * @author Priit Laht
 */
@Data
public class TvShow {
  @JsonProperty(value = "_id")
  private String showId;
  @JsonProperty(value = "title")
  private String title;
  @JsonProperty(value = "num_seasons")
  private int numberOfSeasons;
  @JsonProperty(value = "images")
  private Images images;
  @JsonProperty(value = "imdb_id")
  private String imdbId;
  @JsonProperty(value = "tvdb_id")
  private String tvdbId;
  @JsonProperty(value = "year")
  private String year;
  @JsonProperty(value = "slug")
  private String slug;
  @JsonProperty(value = "last_updated")
  @JsonDeserialize(using = UnixTimestampDeserializer.class)
  private Date lastUpdated;
}

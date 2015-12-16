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
public class Episode {
  @JsonProperty(value = "title")
  private String title;
  @JsonProperty(value = "season")
  private int seasonNumber;
  @JsonProperty(value = "episode")
  private int episodeNumber;
  @JsonProperty(value = "torrents")
  private Torrents torrents;
  @JsonProperty(value = "overview")
  private String overview;
  @JsonProperty(value = "first_aired")
  @JsonDeserialize(using = UnixTimestampDeserializer.class)
  private Date firstAirDate;
  @JsonProperty(value = "tvdb_id")
  private String tvdbId;
  @JsonProperty(value = "date_based")
  private boolean isDateBased;
  @JsonProperty(value = "watched")
  private Watched watched;
}

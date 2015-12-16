package com.priitlaht.eztvapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Priit Laht
 */
@Data
public class Torrents {
  @JsonProperty(value = "0")
  private Torrent unknown;
  @JsonProperty(value = "480p")
  private Torrent sd480p;
  @JsonProperty(value = "720p")
  private Torrent hd720p;
  @JsonProperty(value = "1080p")
  private Torrent hd1080p;
}

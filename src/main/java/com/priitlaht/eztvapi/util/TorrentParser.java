package com.priitlaht.eztvapi.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.priitlaht.eztvapi.model.TvShow;
import com.priitlaht.eztvapi.model.TvShowDetails;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Priit Laht
 */
public class TorrentParser {
  private ObjectMapper objectMapper = new ObjectMapper();

  public List<TvShow> parseShows(String json) {
    try {
      return objectMapper.readValue(json, TypeFactory.defaultInstance().constructCollectionType(List.class, TvShow.class));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new ArrayList<TvShow>();
  }

  public TvShowDetails parseDetails(String json) {
    try {
      return objectMapper.readValue(json, TvShowDetails.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}

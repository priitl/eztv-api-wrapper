package com.priitlaht.eztvapi.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.priitlaht.eztvapi.model.EztvResult;

import java.io.IOException;

/**
 * @author Priit Laht
 */
public class TorrentParser {
  private ObjectMapper objectMapper = new ObjectMapper();

  public EztvResult parse(String json) {
    try {
      return objectMapper.readValue(json, EztvResult.class);
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
    return null;
  }
}

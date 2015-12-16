package com.priitlaht.eztvapi;


import com.priitlaht.eztvapi.model.EztvResult;
import com.priitlaht.eztvapi.util.TorrentParser;
import com.priitlaht.eztvapi.util.UrlReader;

/**
 * @author Priit Laht
 */
public class EztvApi {
  private static TorrentParser torrentParser = new TorrentParser();
  private static UrlReader urlReader = new UrlReader();

  public static EztvResult search(String apiUrl, String imdbId) {
    return torrentParser.parse(urlReader.read(apiUrl + imdbId));
  }
}

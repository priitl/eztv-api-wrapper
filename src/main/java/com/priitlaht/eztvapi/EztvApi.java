package com.priitlaht.eztvapi;


import com.priitlaht.eztvapi.model.TvShow;
import com.priitlaht.eztvapi.model.TvShowDetails;
import com.priitlaht.eztvapi.util.TorrentParser;
import com.priitlaht.eztvapi.util.UrlReader;

import java.util.List;

/**
 * @author Priit Laht
 */
public class EztvApi {
  private static TorrentParser torrentParser = new TorrentParser();
  private static UrlReader urlReader = new UrlReader();

  public static List<TvShow> getTvShows(String apiUrl, int page) {
    return torrentParser.parseShows(urlReader.read(apiUrl + "/shows/" + page));
  }

  public static TvShowDetails getTvShowDetails(String apiUrl, String imdbId) {
    return torrentParser.parseDetails(urlReader.read(apiUrl + "/show/" + imdbId));
  }

}

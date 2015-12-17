package com.priitlaht.eztvapi;


import com.priitlaht.eztvapi.model.TvShow;
import com.priitlaht.eztvapi.model.TvShowDetails;
import com.priitlaht.eztvapi.util.TvShowParser;
import com.priitlaht.eztvapi.util.UrlReader;

import java.util.List;

/**
 * @author Priit Laht
 */
public class EztvApi {
  private static TvShowParser tvShowParser = new TvShowParser();
  private static UrlReader urlReader = new UrlReader();

  public static List<TvShow> getTvShows(String apiUrl, int page) {
    return tvShowParser.parseShows(urlReader.read(apiUrl + "/shows/" + page));
  }

  public static TvShowDetails getTvShowDetails(String apiUrl, String imdbId) {
    return tvShowParser.parseDetails(urlReader.read(apiUrl + "/show/" + imdbId));
  }

}

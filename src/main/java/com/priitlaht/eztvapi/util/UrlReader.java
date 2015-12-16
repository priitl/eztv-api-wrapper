package com.priitlaht.eztvapi.util;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

/**
 * @author Priit Laht
 */
public class UrlReader {

  public String read(String url) {
    try {
      HttpClient client = HttpClientBuilder.create().build();
      HttpResponse response = client.execute(buildGetMethod(url));
      return buildResponseString(response);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    return "";
  }

  private String buildResponseString(HttpResponse response) throws IOException {
    StringBuilder result = new StringBuilder();
    BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
    String inputLine;
    while ((inputLine = in.readLine()) != null) {
      result.append(inputLine);
    }
    in.close();
    return result.toString();
  }

  private HttpGet buildGetMethod(String url, NameValuePair... parameters) throws URISyntaxException {
    URIBuilder builder = new URIBuilder(url);
    builder.setParameters(parameters);
    HttpGet httpGet = new HttpGet(builder.build());
    httpGet.addHeader("accept", "application/json");
    return httpGet;
  }
}
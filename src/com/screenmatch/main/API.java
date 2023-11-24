package com.screenmatch.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
      public static void main(String[] args) throws IOException, InterruptedException {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("http://www.omdbapi.com/?t=Super-Mario-Bros&apikey=d73f361a"))
                        .build();
            HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
      }
}

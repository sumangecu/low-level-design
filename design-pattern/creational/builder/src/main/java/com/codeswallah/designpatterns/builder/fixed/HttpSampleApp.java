package com.codeswallah.designpatterns.builder.fixed;

import java.util.Map;

public class HttpSampleApp {
    public static void main(String[] args) {
        HttpRequest request1 = new HttpRequest.Builder("https://api.example.com/data")
                .build();

        HttpRequest request2 = new HttpRequest.Builder("https://api.example.com/submit")
                .method("POST")
                .body("{\"key\":\"value\"}")
                .timeout(15000)
                .build();

        HttpRequest.Builder builder = new HttpRequest.Builder("https://www.google.com");
        builder.body("config_payload01").timeout(3000).method("GET");

        HttpRequest request4 = builder.build();
        System.out.println("Print request 4 : " + request4);

        HttpRequest request3 = new HttpRequest.Builder("https://api.example.com/config")
                .method("PUT")
                .addHeaders(Map.of("X-API-Key", "secret"))
                .addQueryParams(Map.of("env", "prod"))
                .body("config_payload")
                .timeout(5000)
                .build();

        System.out.println(request1);
        System.out.println(request2);
        System.out.println(request3);
    }
}

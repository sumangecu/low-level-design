package com.codeswallah.designpatterns.builder.raw;

import java.util.Map;

public class SampleApp {
    public static void main(String[] args) {
        HttpRequestTelescoping request = new HttpRequestTelescoping("https://api.openai.com/v1");

        HttpRequestTelescoping req2 = new HttpRequestTelescoping(
                "https://api.openai.com/submit",
                "POST",
                null,
                null,
                "{\"key\":\"value\"}"
        );

        HttpRequestTelescoping req3 = new HttpRequestTelescoping(
                "https://api.openai.com/config",
                "PUT",
                Map.of("X-API-Key", "secret"),
                null,
                "config_data",
                10000
        );
    }
}

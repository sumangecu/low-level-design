package com.codeswallah.designpatterns.builder.fixed;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private final String url;

    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeout;

    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.queryParams = builder.queryParams;
        this.body = builder.body;
        this.timeout = builder.timeout;
    }

    public String getUrl() { return this.url; }
    public String getMethod() { return this.method; }
    public Map<String, String> getHeaders() { return this.headers; }
    public Map<String, String> getQueryParams() { return this.queryParams; }
    public String getBody() { return this.body; }
    public int getTimeout() { return this.timeout; }

    @Override
    public String toString() {
        return new StringBuilder("HttpRequest{")
                .append("URL='").append(this.url).append("', ")
                .append("Method=").append(this.method).append(", ")
                .append("Headers=").append(this.headers).append(", ")
                .append("Params=").append(this.queryParams).append(", ")
                .append("Body=").append(this.body).append(", ")
                .append("Timeout=").append(this.timeout)
                .append("}")
                .toString();
    }

    public static class Builder {
        private final String url;

        private String method = "GET";
        private final Map<String, String> headers = new HashMap<>();
        private final Map<String, String> queryParams = new HashMap<>();
        private String body;
        private int timeout = 50_000;

        // required fields
        public Builder(String url) {
            this.url = url;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder addHeaders(Map<String, String> headers) {
            this.headers.putAll(headers);
            return this;
        }

        public Builder addQueryParams(Map<String, String> queryParams) {
            this.queryParams.putAll(queryParams);
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}

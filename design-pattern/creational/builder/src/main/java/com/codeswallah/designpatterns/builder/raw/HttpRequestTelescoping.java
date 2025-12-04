package com.codeswallah.designpatterns.builder.raw;

import java.util.Map;

public class HttpRequestTelescoping {
    private String url;
    private String method;
    private Map<String, String> headers;
    private Map<String, String> queryParams;
    private String body;
    private int timeout;

    public HttpRequestTelescoping(String url) {
        this(url, "GET");
    }

    public HttpRequestTelescoping(String url, String method) {
        this(url, method, null);
    }

    public HttpRequestTelescoping(String url, String method, Map<String, String> headers) {
        this(url, method, headers, null);
    }

    public HttpRequestTelescoping(String url, String method, Map<String, String> headers,
                                  Map<String, String> queryParams) {
        this(url, method, headers, queryParams, null);
    }

    public HttpRequestTelescoping(String url, String method, Map<String, String> headers,
                                  Map<String, String> queryParams, String body) {
        this(url, method, headers, queryParams, body, 50_000);
    }

    public HttpRequestTelescoping(String url, String method, Map<String, String> headers,
                                  Map<String, String> queryParams, String body, int timeout) {
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.queryParams = queryParams;
        this.body = body;
        this.timeout = timeout;

        System.out.println("HttpRequest created : URL=" + url +
                ", Method=" + method +
                ", Headers=" + this.headers +
                ", Params=" + this.queryParams +
                ", Body=" + this.body +
                ", Timeout=" + this.timeout);
    }

    // Add necessary getters here.
}

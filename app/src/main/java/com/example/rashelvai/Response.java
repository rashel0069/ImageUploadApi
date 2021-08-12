package com.example.rashelvai;

public class Response {
    private String product_name;
    private String webview_url;

    public String getProduct_name() {
        return product_name;
    }

    public String getWebview_url() {
        return webview_url;
    }

    @Override
    public String toString() {
        return "Response{" +
                "product_name='" + product_name + '\'' +
                ", webview_url='" + webview_url + '\'' +
                '}';
    }
}

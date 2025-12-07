package com.codeswallah.designpatterns.decorator;

public interface DataSource {
    void writeData(String data);
    String readData();
}

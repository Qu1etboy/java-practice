package com.qu1etboy.pattern.di;

import java.util.List;

public class DataSourceFile<T> implements DataSource<T> {

    private String fileName;

    public DataSourceFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<T> read() {
        System.out.println("Read data from file name = " + this.fileName);
        return null;
    }
}

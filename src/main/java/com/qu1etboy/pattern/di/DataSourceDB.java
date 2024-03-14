package com.qu1etboy.pattern.di;

import java.util.List;

public class DataSourceDB<T> implements DataSource<T> {

    @Override
    public List<T> read() {
        System.out.println("Read data from database.");
        return null;
    }
}

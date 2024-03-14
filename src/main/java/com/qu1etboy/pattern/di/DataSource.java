package com.qu1etboy.pattern.di;

import java.util.List;

public interface DataSource<T> {

    List<T> read();
}

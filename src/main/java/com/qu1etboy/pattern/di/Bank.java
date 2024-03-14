package com.qu1etboy.pattern.di;

import java.util.List;

public class Bank {

    List<Customer> customers;
    DataSource<Customer> dataSource;

    public Bank(DataSource<Customer> dataSource) {
        this.dataSource = dataSource;

        this.customers = dataSource.read();
    }
}

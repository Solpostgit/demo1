package com.example.demo1.service;

import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {
    private int counter;

    @Override
    public int getRequestCount() {
        return ++counter;
    }
}

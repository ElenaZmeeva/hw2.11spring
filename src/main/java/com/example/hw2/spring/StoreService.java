package com.example.hw2.spring;

import java.util.List;

public interface StoreService {

    List<Integer> getItems();


    List<Integer> add(List<Integer> items);
}

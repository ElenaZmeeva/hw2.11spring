package com.example.hw2.spring;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final Cart cart;

    public StoreServiceImpl(Cart cart) {
        this.cart = cart;
    }

@Override
public List<Integer> getItems(){
    return cart.getItems();
    }

@Override
public List<Integer> add(List<Integer> items){
    return cart.add(items);
    }
}

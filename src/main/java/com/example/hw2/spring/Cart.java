package com.example.hw2.spring;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }

    public List<Integer> add(List<Integer> items) {
        this.items.addAll(items);
        return items;
    }
}

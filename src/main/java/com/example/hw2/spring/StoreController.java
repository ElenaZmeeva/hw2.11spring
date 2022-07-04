package com.example.hw2.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")

public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping (path = "/get")
    public List<Integer> getItems (){
        return  storeService.getItems();
    }

    @GetMapping(path = "/add")
    public List<Integer>  add (@RequestParam ("ID") List<Integer> items ){
        return  storeService.add(items);
    }
}

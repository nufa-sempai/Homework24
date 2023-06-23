package com.example.homework24.controller;

import com.example.homework24.server.BasketServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketServer basketServer;

    public BasketController(BasketServer basketServer) {
        this.basketServer = basketServer;
    }
    @GetMapping
    public String welcome(){
        return "welcome SPRING";
    }
    @GetMapping ("/add")
    public void add(@RequestParam("id")List<Integer>values){
        basketServer.addAll(values);
    }
    @GetMapping("/get")
    public List<Integer> get(){
        return basketServer.getAll();
    }
}
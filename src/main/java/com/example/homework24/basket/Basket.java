package com.example.homework24.basket;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private   List<Integer>firstBasket = new ArrayList<>();
    public void addAll(List<Integer>values){
        firstBasket.addAll(values);
    }
    public List<Integer> getAll(){
        return firstBasket;
    }
}
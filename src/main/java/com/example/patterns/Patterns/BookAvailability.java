package com.example.patterns.Patterns;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " nhận thông báo: " + message);
    }
}

public class BookAvailability {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

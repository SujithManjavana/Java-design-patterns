package com.sujith.observer_design_pattern;

public class Subscriber implements Observer {
    public Subscriber(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void update(String title) {
        System.out.println("Hey " + name + ", video uploaded: " + title);
    }


}

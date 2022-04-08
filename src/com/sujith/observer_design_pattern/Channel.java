package com.sujith.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Observer subscriber) {
        subs.add((Subscriber) subscriber);
    }

    @Override
    public void unSubscribe(Observer subscriber) {
        subs.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber sub : subs) {
            sub.update(title);
        }
    }

    @Override
    public void uploadVideo(String title) {
        this.title = title;
        notifySubscribers();
    }
}

package com.sujith.observer_design_pattern;

public interface Subject {
    void subscribe(Observer subscriber);

    void unSubscribe(Observer subscriber);

    void notifySubscribers();

    void uploadVideo(String title);
}

package com.sujith.factory;

public class Linux implements OS{
    @Override
    public void spec() {
        System.out.println("Fast, Secure, Stable, Free and open source");
    }
}

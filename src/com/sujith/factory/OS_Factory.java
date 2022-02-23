package com.sujith.factory;

public class OS_Factory {
    public OS getInstance(String str){
        switch (str){
            case "stable":
                return new Mac();
            case "mobile":
                return new Android();
            case "gaming":
                return new Windows();
            default:
                return new Linux();
        }
    }
}

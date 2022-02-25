package com.sujith.factory_design_pattern;

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

package com.sujith.observer_design_pattern;

public class YouTube {
    public static void main(String[] a) {
        Channel myChannel = new Channel();

        Subscriber s1=new Subscriber("Ross");
        Subscriber s2=new Subscriber("Monica");
        Subscriber s3=new Subscriber("Chandler");
        Subscriber s4=new Subscriber("Gunther");

        myChannel.subscribe(s1);
        myChannel.subscribe(s2);
        myChannel.subscribe(s3);
        myChannel.subscribe(s4);


        myChannel.uploadVideo("My video");
    }
}

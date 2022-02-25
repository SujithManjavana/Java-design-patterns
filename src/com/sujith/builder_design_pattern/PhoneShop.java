package com.sujith.builder_design_pattern;

public class PhoneShop {

    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone phone = phoneBuilder
                .setCpu("Qualcomm")
                .setCamera(12)
                .setOs("Android")
                .setStorage(128)
                .setRam(12)
                .getPhone();
        phone.printSpecs();
    }
}

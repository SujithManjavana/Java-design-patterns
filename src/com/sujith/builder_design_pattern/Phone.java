package com.sujith.builder_design_pattern;

public class Phone {
    private String cpu;
    private final int ram;
    private final int storage;
    private final String os;
    private final int camera;

    public Phone(String cpu, int ram, int storage, String os, int camera) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.camera = camera;
    }

    public void printSpecs() {
        System.out.println("cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", camera=" + camera);
    }

}

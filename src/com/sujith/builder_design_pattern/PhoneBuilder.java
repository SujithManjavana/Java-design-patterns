package com.sujith.builder_design_pattern;

//Builder Pattern is a part of creational design pattern
public class PhoneBuilder {
    private String cpu;
    private int ram;
    private int storage;
    private String os;
    private int camera;

    public String getCpu() {
        return cpu;
    }

    public PhoneBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public int getRam() {
        return ram;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public int getStorage() {
        return storage;
    }

    public PhoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public String getOs() {
        return os;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public int getCamera() {
        return camera;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public Phone getPhone() {
        return new Phone(cpu, ram, storage, os, camera);
    }
}

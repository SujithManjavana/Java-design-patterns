package com.sujith.factory_design_pattern;

public class FactoryMain {
    public static void main(String[] args) {
        OS_Factory osf = new OS_Factory();
        OS myOs = osf.getInstance("fast");
        myOs.spec();
    }
}

package com.sujith.adapter_design_pattern;

public class School {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        Pen p = new PenAdapter();
        aw.setP(p);
        aw.writeAssignment("This is my assignment!");
    }
}

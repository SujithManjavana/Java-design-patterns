package com.sujith.adapter_design_pattern;

public class AssignmentWork {
    Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignment(String str) {
        p.write(str);
    }
}

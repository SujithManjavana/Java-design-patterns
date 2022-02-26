package com.sujith.adapter_design_pattern;

public class PenAdapter implements Pen {
    PilotPen pp = new PilotPen();

    @Override
    public void write(String s) {
        pp.mark(s);
    }
}

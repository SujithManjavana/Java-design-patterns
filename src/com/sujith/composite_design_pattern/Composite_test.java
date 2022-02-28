package com.sujith.composite_design_pattern;

//composite design pattern is part of structural design pattern
public class Composite_test {

    public static void main(String[] args) {
        Component hd = new Leaf(2000, "Hard disc");
        Component ram = new Leaf(4030, "Ram");
        Component processor = new Leaf(12000, "processor");
        Component keyboard = new Leaf(500, "keyboard");
        Component mouse = new Leaf(600, "mouse");

        Composite mb =new Composite("Motherboard");
        Composite peri =new Composite("peri");
        Composite com =new Composite("Computer");
        Composite cab =new Composite("cabinet");


        mb.addComponent(hd);
        mb.addComponent(ram);
        mb.addComponent(processor);

        peri.addComponent(mouse);
        peri.addComponent(keyboard);

        cab.addComponent(mb);

        com.addComponent(cab);
        com.addComponent(peri);

        com.showPrice();

    }
}

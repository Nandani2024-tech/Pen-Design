package model;

import strategy.WritingStrategy;

public abstract class Pen implements Writable {

    String brand;
    Refill refill;
    WritingStrategy strategy;

    public Pen(String brand, Refill refill, WritingStrategy strategy) {
        this.brand = brand;
        this.refill = refill;
        this.strategy = strategy;
    }

    @Override
    public void write(String text) {
        strategy.write(text + " using " + this.getClass().getSimpleName());
    }
}
package model;

import strategy.WritingStrategy;

public class GelPen extends Pen {

    public GelPen(String brand, Refill refill, WritingStrategy strategy) {
        super(brand, refill, strategy);
    }
}
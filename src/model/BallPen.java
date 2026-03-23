package model;

import strategy.WritingStrategy;

public class BallPen extends Pen {

    public BallPen(String brand, Refill refill, WritingStrategy strategy) {
        super(brand, refill, strategy);
    }
}
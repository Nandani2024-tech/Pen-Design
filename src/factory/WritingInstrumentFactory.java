package factory;

import model.*;
import strategy.*;

public class WritingInstrumentFactory {

    public static Writable getInstrument(String type) {

        Ink ink = new Ink("Blue");
        Nib nib = new Nib("Fine");
        Refill refill = new Refill(ink, nib);

        if (type.equalsIgnoreCase("gel")) {
            return new GelPen("Reynolds", refill, new SmoothWritingStrategy());
        }

        if (type.equalsIgnoreCase("ball")) {
            return new BallPen("Cello", refill, new ThickWritingStrategy());
        }

        return null;
    }
}
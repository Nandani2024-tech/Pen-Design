import factory.WritingInstrumentFactory;
import model.Writable;

public class Main {

    public static void main(String[] args) {

        Writable pen1 = WritingInstrumentFactory.getInstrument("gel");
        pen1.write("Hello");

        Writable pen2 = WritingInstrumentFactory.getInstrument("ball");
        pen2.write("World");
    }
}
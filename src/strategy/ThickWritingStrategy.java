package strategy;

public class ThickWritingStrategy implements WritingStrategy {

    public void write(String text) {
        System.out.println(text + " is being written with thick strokes");
    }
}
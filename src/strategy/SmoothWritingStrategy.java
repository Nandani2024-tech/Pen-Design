package strategy;

public class SmoothWritingStrategy implements WritingStrategy {

    public void write(String text) {
        System.out.println(text + " is being written smoothly");
    }
}
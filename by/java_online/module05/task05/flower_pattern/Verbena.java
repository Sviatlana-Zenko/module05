package by.java_online.module05.task05.flower_pattern;

public class Verbena extends Flower {
    private String colour;

    public Verbena(String colour) {
        this.colour = colour;
    }

    @Override
    public String getColour() {
        return this.colour;
    }
}

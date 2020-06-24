package by.java_online.module05.task05.flower_pattern;

public class Orchid extends Flower {
    private String colour;

    public Orchid(String colour) {
        this.colour = colour;
    }

    @Override
    public String getColour() {
        return this.colour;
    }
}
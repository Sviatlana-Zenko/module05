package by.java_online.module05.task05.view;

import by.java_online.module05.task05.entity.FlowerComposition;
import by.java_online.module05.task05.flower_pattern.Flower;

public class CompositionView {
    public void printInfoAboutComposition(FlowerComposition composition) {

        System.out.println("Here's the flower composition you've created.\n" +
                "Composition consists of " + composition.getFlowers().size() + " flowers:");

        for (Flower flower : composition.getFlowers()) {
            System.out.println("- " + flower.getClass().getSimpleName() + ", colour: " + flower.getColour() + ";");
        }

        System.out.println("Wrapping :\n" + composition.getWrapping().getType() +
                ", colour: " + composition.getWrapping().getColour() + ".");
    }

}
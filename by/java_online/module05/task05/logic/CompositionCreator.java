package by.java_online.module05.task05.logic;

import by.java_online.module05.task05.entity.*;
import by.java_online.module05.task05.flower_pattern.Flower;
import by.java_online.module05.task05.flower_pattern.FlowerFactory;
import by.java_online.module05.task05.input.Input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompositionCreator {
    FlowerFactory factory = new FlowerFactory();
    Input input = new Input();

    public FlowerComposition createComposition() throws IOException {
        FlowerComposition composition;
        List<Flower> flowers;
        Wrapping wrapping;

        flowers = chooseFlowers();
        wrapping = chooseWrapping();

        composition = new FlowerComposition(flowers, wrapping);

        return composition;
    }

    public List<Flower> chooseFlowers() throws IOException {
        List<Flower> flowers = new ArrayList<>();
        boolean isEnough = false;

        while (!isEnough) {
            String flowerType;
            String flowerColour;
            String answer;
            int numberOfFlowers;
            int minNumber;
            int maxNumber;

            minNumber = 1;
            maxNumber = 100;

            flowerType = input.chooseParameterValue("by/java_online/module05/task05/file/Flowers.txt",
                    "Choose flower you want to add. Enter flower name ->");

            flowerColour = input.chooseParameterValue("by/java_online/module05/task05/file/FlowerColours.txt",
                    "Choose colour of this flower. Enter colour ->");

            System.out.println("How many flowers of this type do you want to add? " +
                    "(min - " + minNumber + ", max - " + maxNumber + "). Enter number - >");


            numberOfFlowers = input.enterNumber(minNumber, maxNumber);

            addFlower(flowers, flowerType, flowerColour, numberOfFlowers);

            System.out.println("Do you want to add other flowers? Enter 'yes' or 'no' ->");
            answer = input.enterString();

            while (!answer.equalsIgnoreCase("yes") & !answer.equalsIgnoreCase("no")) {
                System.out.println("There is no such option. Try again ->");
                answer = input.enterString();
            }

            if (answer.equalsIgnoreCase("no")) {
                isEnough = true;
            }
        }

        return flowers;
    }

    public Wrapping chooseWrapping() throws IOException {
        String wrappingType;
        String wrappingColour;
        Wrapping wrapping;

        wrappingType = input.chooseParameterValue("by/java_online/module05/task05/file/Wrapping.txt",
                "Choose wrapping for your composition. Enter type of wrapping ->");

        wrappingColour = input.chooseParameterValue("by/java_online/module05/task05/file/WrappingColours.txt",
                "Choose colour of this flower. Enter colour ->");

        wrapping = new Wrapping(wrappingType, wrappingColour);

        return wrapping;
    }

    public void addFlower(List<Flower> flowers, String flowerType, String colour, int number) {
        while (number > 0) {
            Flower toAdd = factory.growFlower(flowerType, colour);
            flowers.add(toAdd);
            number--;
        }
    }
}
package by.java_online.module05.task05.flower_pattern;

public class FlowerFactory {
    public Flower growFlower(String flowerType, String colour) {
        Flower flower = null;

        if (flowerType.equalsIgnoreCase("Gladiolus")) {
            return new Gladiolus(colour);
        } else if (flowerType.equalsIgnoreCase("Iris")) {
            return new Iris(colour);
        } else if (flowerType.equalsIgnoreCase("Lily")) {
            return new Lily(colour);
        } else if (flowerType.equalsIgnoreCase("Orchid")) {
            return new Orchid(colour);
        } else if (flowerType.equalsIgnoreCase("Rose")) {
            return new Rose(colour);
        } else if (flowerType.equalsIgnoreCase("Verbena")) {
            return new Verbena(colour);
        }

        return flower;
    }
}
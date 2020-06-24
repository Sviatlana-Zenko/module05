package by.java_online.module05.task04.logic;

import by.java_online.module05.task04.entity.Treasure;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CaveLogic {
    public List<Treasure> createListOfTreasures() throws IOException {
        List<Treasure> treasures = new ArrayList<>();
        FileReader reader = new FileReader("by/java_online/module05/task04/file/ListOfTreasures.txt");
        Scanner sc = new Scanner(reader);

        while (sc.hasNextLine()) {
            treasures.add(new Treasure(Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }

        treasures.sort(Comparator.comparing(Treasure::getCost));
        reader.close();

        return treasures;
    }

    public List<Treasure> findMostExpensiveTreasure(List<Treasure> treasures) {
        double highestCost;
        List<Treasure> mostExpensiveTreasures = new ArrayList<>();

        highestCost = treasures.get(treasures.size() - 1).getCost();

        for (Treasure treasure : treasures) {
            if (treasure.getCost() == highestCost) {
                mostExpensiveTreasures.add(treasure);
            }
        }

        return mostExpensiveTreasures;
    }

    public List<Treasure> createListWithGivenCost(List<Treasure> treasures, int givenCost) {
        Random element = new Random();
        List<Treasure> list = new ArrayList<>();
        List<Treasure> listWithGivenCost = new ArrayList<>();
        int index;
        int tempCost;

        list.addAll(treasures);
        list.removeIf(treasure -> treasure.getCost() > givenCost);

        index = element.nextInt(list.size());

        listWithGivenCost.add(list.get(index));
        list.remove(index);

        tempCost = givenCost - listWithGivenCost.get(0).getCost();

        while (tempCost != 0) {
            boolean check = false;

            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i).getCost() <= tempCost) {
                    listWithGivenCost.add(list.get(i));
                    tempCost = tempCost - list.get(i).getCost();
                    list.remove(i);
                    check = true;
                }
            }

            if (!check) {
                break;
            }
        }

        return listWithGivenCost;
    }
}
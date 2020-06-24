package by.java_online.module05.task04.view;

import by.java_online.module05.task04.entity.Dragon;
import by.java_online.module05.task04.entity.Treasure;
import by.java_online.module05.task04.logic.CaveLogic;

import java.util.List;

public class TreasureView {
    CaveLogic caveLogic = new CaveLogic();

    public void printAllTreasures(Dragon dragon) {
        System.out.println("Here's a list of treasures that you can find in the cave:");

        for (Treasure treasure : dragon.getCave().getTreasures()) {
            showInfoAboutTreasure(treasure);
        }
    }

    public void printMostExpensiveTreasure(List<Treasure> treasures) {
        List<Treasure> list;
        list = caveLogic.findMostExpensiveTreasure(treasures);

        System.out.println("The most expensive treasure(s) in the cave:");
        for (Treasure treasure : list) {
            showInfoAboutTreasure(treasure);
        }
    }


    public void printListWithGivenCost(List<Treasure> treasures, int givenCost) {
        int sum = 0;
        List<Treasure> list;

        list = caveLogic.createListWithGivenCost(treasures, givenCost);

        for (Treasure treasure : list) {
            showInfoAboutTreasure(treasure);

            sum += treasure.getCost();
        }

        System.out.println("Total cost: " + sum);
    }

    public void showInfoAboutTreasure(Treasure treasure) {
        System.out.println("cost: " + treasure.getCost() +
                           ", " + treasure.getDescription());
    }
}

package by.java_online.module05.task04.menu;

import by.java_online.module05.task04.entity.Dragon;
import by.java_online.module05.task04.input.Input;
import by.java_online.module05.task04.view.TreasureView;

public class ConsoleMenu {
    TreasureView treasureView = new TreasureView();
    Input input = new Input();

    public void startConsoleMenu(Dragon dragon) {
        int operationNumber;

        System.out.println("You are standing in " + dragon.getName() + "'s treasure cave.\n" +
                           "Here's the list of options you can do with these treasures:\n" +
                           "to see all treasures - enter 1\n" +
                           "to see the most expensive one - enter 2\n" +
                           "to create a list of treasure with given cost - enter 3.");

        operationNumber = input.enterValue();

        switch (operationNumber) {
            case 1:
                treasureView.printAllTreasures(dragon);
                break;
            case 2:
                treasureView.printMostExpensiveTreasure(dragon.getCave().getTreasures());
                break;
            case 3:
                int enteredCost;
                int minCost;

                System.out.println("Enter your cost: ");

                enteredCost = input.enterValue();
                minCost = dragon.getCave().getTreasures().get(0).getCost();

                if (enteredCost >= minCost) {
                    treasureView.printListWithGivenCost(dragon.getCave().getTreasures(), enteredCost);
                } else {
                    System.out.println("Can't create a list of tresuares for you " +
                                       "(minimum treasure cost - " + minCost + ")");
                }
                break;
            default:
                System.out.println("Wrong command. There is no such option");
        }
    }
}

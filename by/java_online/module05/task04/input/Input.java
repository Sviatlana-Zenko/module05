package by.java_online.module05.task04.input;

import java.util.Scanner;

public class Input {
    public int enterValue() {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int enteredValue = 0;
        boolean check = false;

        while (!check) {
            while (!input.hasNextInt()) {
                input.nextLine();
                System.out.println("Wrong input. Try again.");
            }
            enteredValue = input.nextInt();

            if (enteredValue > 0) {
                check = true;
            } else {
                System.out.println("Please, enter positive number.");
            }
        }

        return enteredValue;
    }
}
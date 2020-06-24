package by.java_online.module05.task05.input;

import by.java_online.module05.task05.logic.ListCreator;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Input {
    ListCreator creator = new ListCreator();

    public String chooseParameterValue(String fileAddress, String message) throws IOException {
        String parameterValue = "";
        boolean condition = false;
        List<String> listOfParameters;

        listOfParameters = creator.createList(fileAddress);

        System.out.println(message);
        for (String value : listOfParameters) {
            System.out.println(value);
        }

        while (!condition) {
            String enteredValue;
            enteredValue = enterString();

            for (String value : listOfParameters) {
                if (enteredValue.equalsIgnoreCase(value)) {
                    parameterValue = value;
                    condition = true;
                    break;
                }
            }

            if (!condition) {
                System.out.println("There is no such option. Try again ->");
            }
        }

        return parameterValue;
    }

    public int enterNumber(int min, int max) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int number = 0;
        boolean condition = false;

        while (!condition) {
            while (!input.hasNextInt()) {
                input.nextLine();
                System.out.println("Wrong type of input. Try again ->");
            }
            number = input.nextInt();

            if (number >= min && number <= max) {
                condition = true;
            } else {
                System.out.println("Check your number and try again ->");
            }
        }

        return number;
    }

    public String enterString() {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String value;

        value = input.nextLine();

        return value;
    }
}
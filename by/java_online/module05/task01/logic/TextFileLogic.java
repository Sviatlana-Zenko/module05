package by.java_online.module05.task01.logic;

import by.java_online.module05.task01.entity.TextFile;

public class TextFileLogic {
    public void addText(TextFile textFile, String textToAdd) {
        char symbol = ' ';
        StringBuilder stringBuilder = new StringBuilder(textFile.getText());

        if (stringBuilder.charAt(stringBuilder.length() - 1) != symbol) {
            stringBuilder.append(symbol);
        }

        stringBuilder.append(textToAdd);
        textFile.setText(stringBuilder.toString());
    }
}

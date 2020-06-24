package by.java_online.module05.task01.view;

import by.java_online.module05.task01.entity.TextFile;

public class TextFileView {
    public void printTextFile(TextFile textFile) {
        System.out.println("File name: '" + textFile.getFileName() + "'\n" +
                           "Text: '" + textFile.getText() + "'\n");
    }
}

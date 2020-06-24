/*
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

package by.java_online.module05.task01.main;

import by.java_online.module05.task01.view.DirectoryView;
import by.java_online.module05.task01.view.TextFileView;
import by.java_online.module05.task01.entity.Directory;
import by.java_online.module05.task01.entity.TextFile;
import by.java_online.module05.task01.logic.DirectoryLogic;
import by.java_online.module05.task01.logic.FileLogic;
import by.java_online.module05.task01.logic.TextFileLogic;

public class Main {
    public static void main(String[] args) {
        FileLogic fileLogic = new FileLogic();
        TextFileLogic textFileLogic = new TextFileLogic();
        DirectoryLogic directoryLogic = new DirectoryLogic();
        TextFileView textFileView = new TextFileView();
        DirectoryView directoryView = new DirectoryView();

        TextFile file1 = new TextFile("First text file", "Here's our text. This is the second sentence.");

        textFileView.printTextFile(file1);

        textFileLogic.addText(file1, "We need more sentences. Let's add one more sentence.");
        textFileLogic.addText(file1, "And this is the last one.");

        textFileView.printTextFile(file1);

        fileLogic.renameFile(file1, "FIRST text file");

        textFileView.printTextFile(file1);

        Directory directory = new Directory("First directory");

        directoryLogic.addFile(directory, file1);
        directoryLogic.addFile(directory, new TextFile("Second text file", "Short text that consists of 1 sentence."));

        directoryView.printInfoAboutDirectory(directory);

        directoryLogic.deleteFile(directory, file1);

        directoryView.printInfoAboutDirectory(directory);
    }

}

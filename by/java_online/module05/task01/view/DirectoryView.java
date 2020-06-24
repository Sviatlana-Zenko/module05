package by.java_online.module05.task01.view;

import by.java_online.module05.task01.entity.Directory;
import by.java_online.module05.task01.entity.File;

public class DirectoryView {

    public void printInfoAboutDirectory(Directory directory) {
        System.out.println("Directory name: '" + directory.getDirectoryName() + "'.\n" +
                           "Directory contains the following file(s):");

        for (File file : directory.getFiles()) {
            System.out.println("- " + file.getFileName());
        }

        System.out.println();
    }
}

package by.java_online.module05.task01.logic;

import by.java_online.module05.task01.entity.Directory;
import by.java_online.module05.task01.entity.File;

public class DirectoryLogic {
    public void addFile(Directory directory, File fileToAdd) {
        directory.getFiles().add(fileToAdd);
    }

    public void deleteFile(Directory directory, File fileToDelete) {
        directory.getFiles().remove(fileToDelete);
    }
}

package by.java_online.module05.task01.logic;

import by.java_online.module05.task01.entity.File;

public class FileLogic {
    public void renameFile(File file, String newFileName) {
        file.setFileName(newFileName);
    }
}

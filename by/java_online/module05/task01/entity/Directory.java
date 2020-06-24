package by.java_online.module05.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String directoryName;
    private List <File> files;

    public Directory() {
        directoryName = "";
        files = new ArrayList<>();
    }

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public Directory(String directoryName, List <File> files) {
        this.directoryName = directoryName;
        this.files = files;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "directoryName: " + directoryName +
                ", files: " + files +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((directoryName == null) ? 0 : directoryName.hashCode());
        result = prime * result + ((files == null) ? 0 : files.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Directory other = (Directory) obj;
        if (directoryName == null) {
            if (other.directoryName != null)
                return false;
        } else if (!directoryName.equals(other.directoryName))
            return false;
        if (files == null) {
            if (other.files != null)
                return false;
        } else if (!files.equals(other.files))
            return false;
        return true;
    }
}
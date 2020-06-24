package by.java_online.module05.task05.logic;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCreator {
    public List<String> createList(String fileAddress) throws IOException {
        FileReader reader = new FileReader(fileAddress);
        Scanner scanner = new Scanner(reader);
        List<String> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }

        reader.close();

        return  list;
    }
}

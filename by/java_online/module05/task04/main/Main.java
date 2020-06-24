/*
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * - Приложение должно быть объектно-, а не процедурно-ориентированным.
 * - Каждый класс должен иметь отражающее смысл название и информативный состав.
 * - Наследование должно применяться только тогда, когда это имеет смысл.
 * - При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * - Классы должны быть грамотно разложены по пакетам.
 * - Консольное меню должно быть минимальным.
 * - Для хранения данных можно использовать файлы.
 *
 * Дракон и его сокровища.
 * Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости
 * сокровища и выбора сокровищ на заданную сумму
 */

package by.java_online.module05.task04.main;

import by.java_online.module05.task04.entity.Cave;
import by.java_online.module05.task04.logic.CaveLogic;
import by.java_online.module05.task04.menu.ConsoleMenu;
import by.java_online.module05.task04.entity.Dragon;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CaveLogic logic = new CaveLogic();
        ConsoleMenu consoleMenu = new ConsoleMenu();
        Cave cave = new Cave();
        Dragon dragon = new Dragon();

        cave.setTreasures(logic.createListOfTreasures());

        dragon.setName("The biggest Dragon");
        dragon.setCave(cave);

        consoleMenu.startConsoleMenu(dragon);
    }
}

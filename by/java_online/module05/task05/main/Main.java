/*
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * Корректно спроектируйте и реализуйте предметную область задачи.
 * Для создания объектов из иерархии классов продумайте возможность
 * использования порождающих шаблонов проектирования.
 * Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * Для проверки корректности переданных данных можно применить регулярные выражения.
 * Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 *
 * Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные
 * композиции (объект, представляющий собой цветочную композицию). Составляющими
 * цветочной композиции являются цветы и упаковка.

 */

package by.java_online.module05.task05.main;

import by.java_online.module05.task05.entity.FlowerComposition;
import by.java_online.module05.task05.logic.CompositionCreator;
import by.java_online.module05.task05.view.CompositionView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CompositionCreator creator = new CompositionCreator();
        CompositionView view = new CompositionView();

        FlowerComposition composition = creator.createComposition();

        view.printInfoAboutComposition(composition);
    }
}
package calculator;

import java.util.Scanner;

public class EuclidDistanceCalculator {

    public void calc() {
        Scanner sc = new Scanner(System.in); //здесь мы создаем слушателя данных, вводимых с клавиатуры
        System.out.println("Ок, давай вычислим евклидово расстояние.");

        System.out.print("Введи x1: ");
        double x1 = sc.nextDouble(); //здесь мы ждем пока пользователь введет данные и нажмет Enter

        System.out.print("Введи y1: ");
        double y1 = sc.nextDouble(); //здесь мы ждем пока пользователь введет данные и нажмет Enter

        System.out.print("Введи x2: ");
        double x2 = sc.nextDouble(); //здесь мы ждем пока пользователь введет данные и нажмет Enter

        System.out.print("Введи y3: ");
        double y2 = sc.nextDouble(); //здесь мы ждем пока пользователь введет данные и нажмет Enter

        double euclidDistance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // формируем ответное сообщение
        String outputMessage = String.format("Евклидово расстояние между точками (%f, %f) и (%f, %f) равно %f", x1, y1, x2, y2, euclidDistance);
        System.out.println(outputMessage); //печатаем ответное сообщение в консоли
    }
}

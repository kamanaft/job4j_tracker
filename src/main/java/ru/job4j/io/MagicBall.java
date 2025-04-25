package ru.job4j.io;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static String oraculSay(int answer) {
        String result = "";
        switch (answer) {
            case 0:
                result = "Да";
                break;
            case 1:
                result = "Нет";
                break;
            case 2:
                result = "Может быть";
                break;
            default:
                result = "Некорректный ответ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner in = new Scanner(System.in);
        String q = in.nextLine();
        int answer = new Random().nextInt(3);
        System.out.println(oraculSay(answer));
        in.close();
    }
}
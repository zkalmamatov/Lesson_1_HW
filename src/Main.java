//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String mrGreenBoy = "";
        final int NUM = 18;
        String word = "Восемьнадцать";
        mrGreenBoy = NUM + " " + word;

        System.out.println(NUM);
        System.out.println(word);
        System.out.println(mrGreenBoy);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }
        else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String nameIn = scanner.next();
        System.out.println("Привет " + nameIn);
    }

}

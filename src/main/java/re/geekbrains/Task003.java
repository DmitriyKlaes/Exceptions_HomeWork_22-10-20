package re.geekbrains;

/*
Разработайте программу, которая выбросит Exception,
когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String msg = scn.nextLine();
        if (msg.isEmpty()) {
            throw new RuntimeException("Пустую строку вводить нельзя!");
        } else if (msg.isBlank()) {
            throw new RuntimeException("Строка содержит только пробелы!");
        } else {
            System.out.println(msg);
        }
        scn.close();
    }
}

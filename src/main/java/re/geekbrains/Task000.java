package re.geekbrains;

/*
Реализуйте метод, который запрашивает у пользователя ввод
дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

import java.util.Scanner;

public class Task000 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(readFloat(scn));
        scn.close();
    }

    // Я долго думал и решил ограничить ввод целочисленных значений
    // Просят же ввести float, пусть будет только float =)
    private static float readFloat(Scanner scn) {
        System.out.print("Введите дробное число: ");
        while (true) {
            try {
                String result = scn.nextLine();
                if (tryInt(result)) {
                    throw new RuntimeException();
                } else {
                    return Float.parseFloat(result);
                }
            } catch (RuntimeException e) {
                System.out.print("Ошибка ввода! Введите дробное число: ");
            }
        }
    }

    public static boolean tryInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

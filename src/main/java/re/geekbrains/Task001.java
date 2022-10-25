package re.geekbrains;

/*
Если необходимо, исправьте данный код:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/

public class Task001 {
    public static void main(String[] args) {

        int[] intArray = {1,1,1,1,1,1,1,1,1,1,1,1};
//        int[] intArray = {1,1,1,1,1,1};
//        int[] intArray = null;

        /*
        Вот мои рассуждения на тему этого задания:
        Значит этот кусок кода написан кем-то, кто хочет посмотреть отлавливаемую ошибку.
        Что на ноль делить нельзя человек знает, потому что эту ошибку он изначально отлавливает.
        Получается сообщение с результатом в блоке трай бесполезно,
        потому что изначально определено, что будет деление на ноль...
        Сообщение никогда не выведется. Его я удалил.
        Далее.. неизвестно что за массив такой... судя по названию там целочисленные значения.
        Откуда этот массив я не знаю, его длину тоже не знаю. И вообще существует ли на него ссылка
        тоже не известно. По хорошему нужно было явно привести делимое или делитель к типу double,
        но из за деления на ноль это не имеет смысла.
        В итоге я отлавливаю дополнительно 2 исключения, это аутофбаундс и наллпоинтер.

        А в целом я думаю, что я бы этот код просто удалил бы и всё, потому что он никакой
        смысловой нагрузки не несет... это какая-то рядовая проверка, работает обработка исключения или нет.
        */
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
        } catch (ArithmeticException | IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
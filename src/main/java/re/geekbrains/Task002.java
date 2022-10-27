package re.geekbrains;

/*
Дан следующий код, исправьте его там, где требуется:
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
*/


/*
Вот мои рассуждения по поводу этой задачи:
Я убрал throws из метода main, потому что возможных исключений не осталось
и пробрасывать выше по стеку нечего.
Удалил все траи-кэтчи из-за потери их актуальности
Что касается убранного кэтча с Throwable, то это родитель классов Exception и Error.
Так как ошибки error перехватить невозможно, то и использовать Throwable
для перехвата исключений не логично... Нужно использовать Exception.
Ну а NullPointerException стал невозможен, потому что теперь примитивы в аргументах к printSum.
Убрал throws для метода printSum, так как там исключений с поиском файла быть не может.
Я бы добавил туда throws NullPointerException, так как в качестве аргументов приходят
не примитивные типы, а классы "обёртки"... но не стал.
Вместо этого я заменил тип аргументов на примитивы.
Потом тут инициализируется массив с 2 элементами и следом в третий индекс
идёт попытка поместить элемент. Я бы вобще удалил эту строку "abc[3] = 9;"
Но я просто поправлю индекс изменяемого элемента и поставлю его в пределах
массива, так как массив инициализируется прямо в методе мейн и, по моему мнению,
тут обычная опечатка.
 */
public class Task002 {
    public static void main(String[] args){
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[1] = 9;
    }
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}

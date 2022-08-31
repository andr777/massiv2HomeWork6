public class Main {
    public static void main(String[] args) {
        /*### Задание 1
Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в формате: «Сумма трат за месяц составила … рублей».
         */
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int summaMondey = 0;
        for (int i : arr) {
            summaMondey = summaMondey + i;
        }
        System.out.println("Сумма трат за месяц составила " + summaMondey + " рублей");
        System.out.println(" ");

        /* ### Задание 2
Следующая задача — найти минимальную и максимальную трату за день.
Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */
        System.out.println("Задание 2");
        //int[] arr = generateRandomArray();
        int summaMin = 333_333;
        int summaMax = -1;
        for (int i : arr) {
            if (i<summaMin) {
                summaMin=i;
            }
            if (i>summaMax) {
                summaMax=i;
            }
        }
        System.out.println("Минимальная  сумма трат за день составила " + summaMin + " рублей. ");
        System.out.println("Максимальная сумма трат за день составила " + summaMax + " рублей. ");

        System.out.println(" ");

/*### Задание 3
А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение
 данных 30 дней.
Нужно написать программу, которая посчитает среднее значение трат за месяц
(то есть сумму всех трат за месяц поделить на количество дней),
и вывести в консоль результат в формате:
«Средняя сумма трат за месяц составила … рублей».
**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом). */

        System.out.println("Задание 3");
        int dneyVMesyace =30;
        float summSrednee = 0;
        summSrednee = (float) summaMondey / dneyVMesyace;
        System.out.println("Средняя сумма трат за месяц составила " + summSrednee + " рублей. ");

        System.out.println(" ");

/* ### Задание 4
Отойдем от подсчетов.
В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
Данные с именами сотрудников хранятся в виде массива символов (char[]).
Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
В результате в консоль должно быть выведено "Ivanov Ivan".
**Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке. */

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int y = 0; y < ( (int) reverseFullName.length / 2 ); y++) {
            temp = reverseFullName[y];
            reverseFullName[y] = reverseFullName[(reverseFullName.length-1)-y];
            reverseFullName[(reverseFullName.length-1)-y]= temp;
        }

        for (char q : reverseFullName) {
            System.out.print(q);
        }

        System.out.println(" ");

    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
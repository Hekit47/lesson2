package lesson2;

public class main {

    public static void main(String[] args) {
        // Задачи закрыты двойным слешем. Чтобы активировать задачу, в методе main уберите двойной слеш в напротив названия
        // задача №1
        //massivZamenaZnacheniy ();
        // задача №2
        //fillEmptyArray ();
        // задача №3
        //numberUnderSix ();
        // задача №4
        //fillArrayDiagonal ();
        // задача №5
        // minMax ();
        // задача №6
        //checkBalance ();
        moveArray();

    }

    public static void massivZamenaZnacheniy() {
        System.out.println("Задача 1");
        int[] arr = {1, 1, 0, 1, 0, 0, 1, 1, 1, 1};
        for (int k = 0; k < arr.length; k++)   // запускаем перебор в рамках массива
        {
            if (arr[k] == 1)                    // если условие выполняется, то присваиваем переменной другое значение 0
            {
                arr[k] = 0;
            } else
                arr[k] = 1;                    //если условие не выполняется, то присваиваем переменной другое значение 1
            System.out.println(arr[k]);
        }

    }

    public static void fillEmptyArray() {
        System.out.println("Задача 2");
        int[] arr = new int[8];
        int i = 3;                             // задаем шаг увеличения
        for (int k = 0; k < 8; k++) {
            arr[k] = i * k;
            System.out.println(arr[k]);
        }
    }

    public static void numberUnderSix() {
        System.out.println("Задача 3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < 6)                     //  если число в текущей ячейке удовлетворяет условиям, то значение увеличиваем в 2 раза
            {
                arr[k] = arr[k] * 2;
                System.out.println(arr[k]);
            } else System.out.println(arr[k]);
        }
    }

    public static void fillArrayDiagonal() {
        System.out.println("Задача 4");
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++)               // подбор переключается по столбцам массива
        {
            for (int j = 0; j < arr.length; j++)           // подбор перебирает значение внутри выбранного столбца
            {
                if (i == j)                                 // в диагонали ячейки имеют зеркальный номер i и j
                {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                } else if (j == arr.length - 1 - i)       // или номер одной ячейки должен быть ниже на размер второй от максимального
                {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                } else System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void minMax() {
        System.out.println("Задача 5*");
        int[] arr = {2, 5, 12, 3, -2, 0, -1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])                               //путем сравнения всех значений находим минимальное, если следующее меньше предыдущего, то оно занимает его место
            {
                min = arr[i];                                // аналогично с максимальным
            }

        }
        System.out.println("Минимальное число массива " + min);
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число массива " + max);

    }

    public static void checkBalance() {
        System.out.println("Задача 6**");
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        int summPt1 = 0;
        int summPt2 = 0;
        int arrLength = arr.length;
        // включаем перебор по всему массиву
        for (int j = 0; j < arrLength; j++) {
            // ссумируем ячейки массива с начала
            summPt1 = summPt1 + arr[j];
            //System.out.println(summPt1);
            // следующий перебор суммирует ячейки с конца, но кроме тех, которые уже проссумированы в первом переборе
            for (int i = arrLength - 1; i > j; i--) {
                summPt2 = summPt2 + arr[i];
            }
            //System.out.println(summPt2);
            // сравниваем суммы, если они равны, то завершаем программу, если нет, то продолжаем перебор
            // в процессе кол-во ячеек в summPt1 увеличивается, а в summPt2 уменьшается
            if (summPt1 == summPt2) {
                System.out.println(true);
                break;
            }
            summPt2 = 0;
        }

    }

    public static void moveArray() {
        System.out.println("Задача 7***");
        int[] arr = {1, 2, 3, 4, 5};
        int move = -7;
        // определяем, по какому маршруту пойдёт число
        if (move >= 0 ) {
            for (int i = 0; i < move; i++) {
                // смещаем значения на размер сдвига
                int x = arr[arr.length - 1];
                for (int j = arr.length - 1; j >= 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = x;
            }

        } else
            move = move * -1;
                for (int i = 0; i < move; i++) {
                    // смещаем значения на размер сдвига
                    int x = arr[0];
                    for (int j = 0; j <= arr.length - 2; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = x;
            }


    }
}



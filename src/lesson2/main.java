package lesson2;

public class main {

            public static void main (String[] args)
        {
            // задача №1
            massivZamenaZnacheniy ();
            // задача №2
            fillEmptyArray ();
            // задача №3
            numberUnderSix ();
            // задача №4
            fillArrayDiagonal ();

        }

        public static void massivZamenaZnacheniy()
        {
            System.out.println("Задача 1");
            int[] arr = {1,1,0,1,0,0,1,1,1,1};
            for (int k = 0; k < arr.length; k ++)
            {
                if (arr[k] == 1)
                {
                    arr[k] = 0;
                }
                else arr[k] = 1;
                System.out.println(arr[k]);
            }

        }

        public static void fillEmptyArray()
        {
            System.out.println("Задача 2");
            int [] arr = new int[8];
            int i = -3;
            for (int k = 0; k < 8; k ++ )
            {
                i = i + 3;
                System.out.println(i);
            }
    }

        public static void numberUnderSix()
        {
            System.out.println("Задача 3");
            int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int k = 0; k < arr.length; k ++)
            {
                if (arr[k] < 6)
                {
                    arr[k] = arr[k] * 2;
                    System.out.println(arr[k]);
                }
                else System.out.println(arr[k]);
            }
        }

        public static void fillArrayDiagonal()
        {
            System.out.println("Задача 4");
            int [][] arr = new int[5][5];
            for (int i = 0; i < arr.length; i ++)
            {
                for (int j = 0; j < arr.length; j ++)
                {
                    if (i == j)
                    {
                        arr[i][j] = 1;
                        System.out.print(arr[i][j] + " ");
                    }
                        else if (j == arr.length - 1 - i)
                    {
                        arr[i][j] = 1;
                        System.out.print(arr[i][j] + " ");
                    }
                        else System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }
        }
}

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int Factorial(int num) //Метод для нахождения факториала числа
    {
        String str = String.valueOf(num);
        int Length = str.length();
        int I = 0;
        int factoriaL = 1;
        while (I < Length)
        {
            factoriaL *= num % 10;
            num /= 10;
            I++;
        }
        return factoriaL;
    }

    public static void main(String[] args) {

        System.out.print("Command line arguments: ");
        for(int i = 0; i < args.length; i++)
        {
            System.out.print(args[i] + " "); //Вывод аргументов командной строки с помощью цикла for
        }

        System.out.print("\n"); //Перенос строки

        int [] arr = new int[] {10, 15, 20, 25, 30}; //инициализация массива

        System.out.print("Исходный массив: "); // вывод исходного массива
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        byte summa = 0;
        for (int i = 0; i < arr.length; i++)
        {
            summa += arr[i]; // находим сумму элементов массива через цикл for
        }
        System.out.println("\nСумма циклом for: " + summa); // вывод найденной суммы

        byte i1 = 0;
        byte summa1 = 0;
        do{
            summa1 += arr[i1]; // находим сумму элементов массива через цикл do while
            i1++;
        }
        while (i1 < arr.length);
        System.out.println("Сумма циклом do while: " + summa1); // вывод найденной суммы

        byte i2 = 0;
        byte summa2 = 0;
        while(i2 < arr.length){
             summa2 += arr[i2]; // находим сумму элементов массива через цикл while
             i2++;
        }
        System.out.print("Сумма циклом while: " + summa2 + "\n"); // вывод найденной суммы

        System.out.print("Первые 10 чисел гармонического ряда: "); //Первые 10 чисел гармонического ряда
        for(int i =1; i < 11; i++){
            System.out.printf("1/%s", i + "  ");
        }

        System.out.print("\nВведите число, факториал которого хотите посчитать: ");
        Scanner in = new Scanner(System.in);
        int factorial = in.nextInt(); //Ввод числа для нахождения факториала пользователем
        System.out.print("Результат = " + Factorial(factorial));

        arr = new int[(int) (Math.random() * 20)];
        for (int i =0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println("\nRandom array (Math.random): " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted random array (Math.random): " + Arrays.toString(arr));

        Random random = new Random();
        arr = new int[(int) (random.nextInt(20))];
        for (int i =0; i < arr.length; i++){
            arr[i] = (int) (random.nextInt(100));
        }

        System.out.println("Random array (Random): " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted random array (Random): " + Arrays.toString(arr));
    }
    
}
package oopLab5;

import oopLab5.io.ArrayReader;
import oopLab5.logic.ArrayProcessor;
import oopLab5.logic.ArraysProcessor;

import java.util.Scanner;


public class Main {

    private double[] array1;
    private double[][] array2;
    private ArrayReader reader;
    private ArrayProcessor calculator;
    private Scanner scanner;


    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        scanner = new Scanner(System.in);
        reader = new ArrayReader();
        calculator = new ArraysProcessor();

        int o;
        while ((o = menu()) != 0) {
            switch (o) {
                case 1 -> {
                    array1 = reader.readOneDimensionalArray("lab51.txt");
                    System.out.println("Модуль суми елементів масиву: " + calculator.sumModule(array1));
                }
                case 2 -> {
                    array1 = reader.readOneDimensionalArray("lab51.txt");
                    System.out.println("Квадратний корінь добутку елементів масиву: " + calculator.squareRoot(array1));
                }
                case 3 -> {
                    array2 = reader.readTwoDimensionalArray("lab52.txt");
                    System.out.println("Значення найменшого додатного елемента заштрихованої частини: " + calculator.findMin(array2));
                }
            }
        }

    }

    public int menu() {
        System.out.println("""
                1. Модуль суми елементів масиву;
                2. Квадратний корінь добутку елементів масиву;
                3. Значення найменшого додатного елемента заштрихованої частини;
                0. Exit
                """);
        int res = scanner.nextInt();
        scanner.nextLine();
        return res;
    }


}
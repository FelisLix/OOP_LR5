package oopLab5.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayReader implements DoubleArrayReader {

    @Override
    public double[] readOneDimensionalArray(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            int n = in.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            return arr;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return null;
        }
    }

    @Override
    public double[][] readTwoDimensionalArray(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            int n = in.nextInt();
            double[][] arr = new double[n][n];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = in.nextDouble();
                }
            }
            return arr;
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return null;
        }
    }

}

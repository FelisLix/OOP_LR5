package oopLab5.logic;

public class ArraysProcessor implements ArrayProcessor {

    @Override
    public double sumModule(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;

        }
        return Math.abs(sum);
    }

    @Override
    public double squareRoot(double[] array) {
        double prod = 1;
        for (double v : array) {
            prod *= v;

        }
        return Math.sqrt(prod);
    }

    @Override
    public double findMin(double[][] array) {
        double min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i][j] > 0) {
                    min = array[i][j];
                    break;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i][j] > 0) {
                    min = Math.min(min, array[i][j]);
                }
            }
        }
        return min;
    }
}

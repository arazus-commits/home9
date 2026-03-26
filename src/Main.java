import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //задача 1
        int[] inputArray1 = {59, 2, 4, 84, 80};
        float[] outputArray1 = new float[4];
        outputArray1[2] = inputArray1[1];
        for (int element : inputArray1) {
            outputArray1[0] += element;
            if (element > outputArray1[1]) {
                outputArray1[1] = element;
            }
            if (element < outputArray1[2]) {
                outputArray1[2] = element;
            }
            outputArray1[3] = outputArray1[0] / inputArray1.length;
        }
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        //задача 2
        int[] inputArray2 = {590, 200, 400, 824, 801};
        float[] outputArray2 = new float[5];
        for (float element : inputArray2) {
            if (element == inputArray2[0])
                outputArray2[0] = element * 0.13f;
            if (element == inputArray2[1])
                outputArray2[1] = element * 0.13f;
            if (element == inputArray2[2])
                outputArray2[2] = element * 0.13f;
            if (element == inputArray2[3])
                outputArray2[3] = element * 0.13f;
            if (element == inputArray2[4])
                outputArray2[4] = element * 0.13f;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        //задача 3
        int[] inputArray3 = {5930, 2030, 4030, 8324, 8051};
        boolean[] outputArray3 = new boolean[5];
        for (float element : inputArray3) {
            if (element == inputArray3[0] && element > 5000) {
                outputArray3[0] = true;
            }
            if (element == inputArray3[1] && element > 5000) {
                outputArray3[1] = true;
            }
            if (element == inputArray3[2] && element > 5000) {
                outputArray3[2] = true;
            }
            if (element == inputArray3[3] && element > 5000) {
                outputArray3[3] = true;
            }
            if (element == inputArray3[4] && element > 5000) {
                outputArray3[4] = true;
            }

        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        //задача 4
        double[] inputArray4 = {5930, 2030, -4030, 8324, 8051};
        boolean[] outputArray4 = new boolean[5];
        for (double element : inputArray4) {
            if (element == inputArray4[0] && element > 0) {
                outputArray4[0] = true;
            } else if (element < 0) {
                break;
            }
            if (element == inputArray4[1] && element > 0) {
                outputArray4[1] = true;
            } else if (element < 0) {
                break;
            }
            if (element == inputArray4[2] && element > 0) {
                outputArray4[2] = true;
            } else if (element < 0) {
                break;
            }
            if (element == inputArray4[3] && element > 0) {
                outputArray4[3] = true;
            } else if (element < 0) {
                break;
            }
            if (element == inputArray4[4] && element > 0) {
                outputArray4[4] = true;
            } else if (element < 0) {
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        //задача 5
        double[] inputArray5 = {59330, 23030, -40330, 83324, 80351};
        boolean[] outputArray5 = new boolean[5];
        int moon = 0;
        for (double element : inputArray5) {
            if (element == inputArray5[0] && element > 0) {
                outputArray5[0] = true;
            }
            if (element == inputArray5[1] && element > 0) {
                outputArray5[1] = true;
            }
            if (element == inputArray5[2] && element > 0) {
                outputArray5[2] = true;
            }
            if (element == inputArray5[3] && element > 0) {
                outputArray5[3] = true;
            }
            if (element == inputArray5[4] && element > 0) {
                outputArray5[4] = true;
            }
        }
        for (boolean i : outputArray5) {
            if (i == true) {
                moon++;
            }
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
        System.out.println("Количество прибыльныз месяцев: " + moon);


    }
}
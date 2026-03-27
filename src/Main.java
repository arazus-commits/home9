import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //задача 1
        System.out.println("Задача 1");
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
        System.out.println("Задача 2");
        int[] inputArray2 = {590, 200, 400, 824, 801};
        float[] outputArray2 = new float[inputArray2.length];
        int s = 0;
        for (float element : inputArray2) {
            outputArray2[s] = element * 0.13f;
            s++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        //задача 3
        System.out.println("Задача 3");
        int[] inputArray3 = {5930, 2030, 4030, 8324, 8051};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int z = 0;
        for (float element : inputArray3) {
            if (element > 5000) {
                outputArray3[z] = true;
            }
            z++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        //задача 4
        System.out.println("Задача 4");
        int[] inputArray4 = {5930, 2030, -4030, 8324, 8051};
        boolean[] outputArray4 = new boolean[inputArray4.length];
        int b = 0;
        for (int element : inputArray4) {
            if (element > 0) {
                outputArray4[b] = true;
            } else {
                break;
            }
            b++;

        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        //задача 5
        System.out.println("Задача 5");
        int[] inputArray5 = {59330, 23030, -40330, 83324, 80351};
        boolean[] outputArray5 = new boolean[inputArray5.length];
        int moon = 0;
        int c = 0;
        for (int element : inputArray5) {
            if (element > 0) {
                outputArray5[c] = true;
            }
            c++;
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
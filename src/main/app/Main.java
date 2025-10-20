package main.app;

import main.tasks.NumberArrayUtils;
import java.util.Arrays;

public class Main {

    static void main() {
        IO.println("\n------- Aufgabe 3 --------");
        int[] a = {1, 3, 0, 0, 0, 0, 0, 0, 0}, b = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        IO.println(Arrays.toString(NumberArrayUtils.add(a, b)));
        int[] c = {8, 3, 0, 0, 0, 0, 0, 0, 0}, d = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        IO.println(Arrays.toString(NumberArrayUtils.subtract(c, d)));
        int[] e = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        IO.println(Arrays.toString(NumberArrayUtils.multiply(e, 2)));
        IO.println(Arrays.toString(NumberArrayUtils.divide(e, 2)));
    }

}
package MySolution;

import edu.princeton.cs.algs4.StdIn;

public class MySelectionSort {
    public static void main(String[] args) {
//        String[] strings = {"a", "b", "c", "d"};

        String[] strings1 = StdIn.readAllStrings();

        sort(strings1);

        for (String string : strings1) {
            System.out.print(string + " ");
        }
    }

    private static void sort(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j <strings.length ; j++) {
                if(less(strings,j,minIndex)){
                    minIndex = j;
                }
            }
            exch(strings,i,minIndex);
        }
    }

    private static boolean less(String[] a,int index1, int index2) {
        return a[index1].compareTo(a[index2]) < 0;
    }

    private static void exch(String[] strings, int i, int minIndex) {
        String temp = strings[i];
        strings[i] = strings[minIndex];
        strings[minIndex] = temp;
    }

}

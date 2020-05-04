package test;

import java.util.ArrayList;
import java.util.Scanner;

public final class TestStaticField {

    private static ArrayList<String> arr;
    private static Scanner scanner;


    public static void add(String str){
        arr.add(str);
    }

    public static void show(){
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
//        TestStaticField.add("a");
//        TestStaticField.add("c");
//        TestStaticField.add("b");

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

//        TestStaticField.show();
    }
}

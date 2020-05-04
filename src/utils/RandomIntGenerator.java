package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomIntGenerator {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\IDEA\\algs4\\test-data\\ints.txt");

        if(file.exists()){
            file.delete();
        }

        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fileWriter);
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            long i1 = random.nextLong();
            bw.write(i1 + " ");
        }

        bw.close();
        fileWriter.close();
        System.out.println("finish");
    }

}

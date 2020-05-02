package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\IDEA\\algs4\\src\\strings.txt");

        if(file.exists()){
            file.delete();
        }

        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            String str = getRandomString(8);
            bw.write(str + " ");
//            bw.newLine();
        }

        bw.close();
        fileWriter.close();
        System.out.println("finish");
    }

    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}

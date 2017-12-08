package training.io;

import javafx.scene.shape.Path;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class lesson2 {


    public static void main(String[] args) throws IOException {

        String filePath = "src\\main\\resources\\files\\file.txt";
        File file = new File(filePath);

//        if (file.exists()) {
//            file.delete();
//        }
//        file.createNewFile();
//
//        file.getName();
//
//        FileReader reader = new FileReader(file);
//        int data;
//
//        while ((data = reader.read()) != -1){
//            System.out.print((char)data);
//        }
//        reader.close();
//
//        FileWriter writer = new FileWriter(filePath, true);
//        writer.write("Welcome");
//        writer.flush();
//        writer.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//
//        String data;
//
//        int count = 0;
//        while ((data = bufferedReader.readLine()) !=null) {
//            count++;
//
//        }
//        System.out.println(count);
//        bufferedReader.close();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("number");
//        String line = scanner.nextLine();
//        scanner.close();

//String str = "HelloWorld";

//        String str[] =[5];
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
//        writer.write(str);
//        writer.flush();
//        writer.close();
//


        texts();
}

    public static void files() throws IOException {
        String filePath = "src\\main\\resources\\files\\file.txt";
        String text = "Hello";
        Files.write(Paths.get(filePath),text.getBytes());
    }

    public static void texts() throws IOException {
        String filePath1 = "src\\main\\resources\\files\\file.txt";
        String filePath2 = "src\\main\\resources\\files\\file2.txt";


    }

}

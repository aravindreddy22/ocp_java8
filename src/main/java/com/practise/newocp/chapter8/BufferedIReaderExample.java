package com.practise.newocp.chapter8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferedIReaderExample {

    public  static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<>();
        try(BufferedReader reader= new BufferedReader(new FileReader(source))){
            String s;
            while((s= reader.readLine())!= null){
                data.add(s);
            }
        }
        return data;
    }

    public static void writeFile(List<String> data, File destination) throws IOException{
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(destination))){
            for (String tmpdata : data) {
                writer.write(tmpdata);
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File source = new File("C:\\Users\\aletakul\\Desktop\\test\\source.txt");
        File destination = new File("C:\\Users\\aletakul\\Desktop\\test\\destination.txt");
        List<String > data= readFile(source);
        data.forEach(System.out::println);
        writeFile(data,destination);
    }
}

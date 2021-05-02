package com.practise.newocp.chapter6;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MultiCatchExample {


    public static void main(String[] args) {
        // Try writing the multi-catch example
        try{
            Path path = Paths.get("xyz.txt");
            String text= new String(Files.readAllBytes(path));
            LocalDate date= LocalDate.parse(text);
            System.out.println(date);
        }catch(IOException | DateTimeParseException e){
            e.printStackTrace();
            throw new RuntimeException();
        }


        //try with Resource

        try(FileReader reader = new FileReader("/abc.txt");
        FileReader reader2 = new FileReader("/abc.txt")
        ){
            reader.getEncoding();

        }catch (IOException e){
            System.err.println(e);
            throw new RuntimeException();
        }

    }
}

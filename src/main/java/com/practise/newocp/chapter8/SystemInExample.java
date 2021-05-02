package com.practise.newocp.chapter8;

import java.io.*;
import java.util.Locale;
import java.util.function.Consumer;

public class SystemInExample {

   /* public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput= reader.readLine();
        System.out.println(" you entered the following : "+userInput);


    }
*/

}


class ConsoleExample{

    public static void main(String[] args) {
        Console console= System.console();
        if(console!= null){
            String userInput= console.readLine();
            console.writer().println("you entered teh following :" + userInput);
        }
        console.writer().format(new Locale("fr","CA"),"Hello Worldd");
    }
}
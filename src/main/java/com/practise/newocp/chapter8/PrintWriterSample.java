package com.practise.newocp.chapter8;

import java.io.*;

public class PrintWriterSample {

    public static void main(String[] args) throws IOException {
        File source = new File("C:\\Users\\aletakul\\Desktop\\test\\destination.txt");
        try(PrintWriter out= new PrintWriter(new BufferedWriter(new FileWriter(source)))){
            out.print("Today weather is:");
            out.println("Sunny");
            out.format("Ut has rained 10.2 Inches this year");
            out.println();
            out.println(" it may rain more");
        }
    }
}

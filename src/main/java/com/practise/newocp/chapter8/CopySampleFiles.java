package com.practise.newocp.chapter8;

import java.io.*;

public class CopySampleFiles {

    public static void copyFiles(File source, File destination) throws IOException{

        try(InputStream in= new FileInputStream(source);
            OutputStream out= new FileOutputStream(destination)){
            int b;
           /* while((b=in.read())!=-1){
                System.out.println(b);
                out.write(b);
            }*/
            // we can also use the byte array to read more bytes at a time
            byte[] buffer = new byte[4];
            while ((b=in.read(buffer))>0){
                System.out.println(" The value of the b :"+b);
                for (byte b1 : buffer) {
                    System.out.println("The ASCII values inside the buffer: "+b1);
                }
                out.write(buffer,0,b);
            }

        }

    }

    public static void main(String[] args) throws IOException{
        File source = new File("C:\\Users\\aletakul\\Desktop\\test\\source.txt");
        File destination = new File("C:\\Users\\aletakul\\Desktop\\test\\destination.txt");
        copyFiles(source,destination);

    }
}

package com.practise.newocp.chapter8;

import java.io.*;

public class BufferedFileStream {

    public static void copyFiles(File source, File destination) throws IOException{

        try(InputStream in= new BufferedInputStream(new FileInputStream(source));
            OutputStream out= new BufferedOutputStream(new FileOutputStream(destination))){
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead=in.read(buffer))>0){
                System.out.println(" The value of the b :"+lengthRead);
                for (byte b1 : buffer) {
                    System.out.println("The ASCII values inside the buffer: "+b1);
                }
                out.write(buffer,0,lengthRead);
            }

        }

    }

    public static void main(String[] args) throws IOException{
        File source = new File("C:\\Users\\aletakul\\Desktop\\test\\source.txt");
        File destination = new File("C:\\Users\\aletakul\\Desktop\\test\\destination.txt");
        copyFiles(source,destination);

    }
}

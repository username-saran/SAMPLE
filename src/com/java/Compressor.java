package com.java;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Compressor {
    public static String INPUT_FILE = "C:/Eclipse/Input.txt";
    static void compress()
    {
        byte[] buffer = new byte[1024];
        try
        {
            GZIPOutputStream os = new GZIPOutputStream(new FileOutputStream("C:/Eclipse/Compress11.gz"));
            FileInputStream in = new FileInputStream(INPUT_FILE);
            int totalSize;
            while((totalSize = in.read(buffer)) > 0 )
            {
                os.write(buffer, 0, totalSize);
            }
            in.close();
            os.finish();
            os.close();
            System.out.println("File Successfully compressed");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        compress();
    }
}

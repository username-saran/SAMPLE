package com.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class DeCompressor {
    public static String INPUT_FILE = "C:/Eclipse/Compress11.gz";
    static final String OUTPUT_FILE = "C:/Eclipse/Compress-decompress.txt";

    static void decompress()
    {
        byte[] buffer = new byte[1024];
        try
        {
            GZIPInputStream is = new GZIPInputStream(new FileInputStream(INPUT_FILE));

            FileOutputStream out =
                    new FileOutputStream(OUTPUT_FILE);

            int totalSize;
            while((totalSize = is.read(buffer)) > 0 )
            {
                out.write(buffer, 0, totalSize);
            }

            out.close();
            is.close();

            System.out.println("File Successfully decompressed");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void main (String[] args)
    {
        decompress();

    }
}

package com.kodcu.question11;

import java.io.*;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

/*
TODO: 
 1 - Simply the code -  5 mins
 2 - Instructor will show the solutions
 3 - Refactor and ask questions 
*/
public class ReadAndWriteFile {


    private static final int BUFFER_SIZE = 1000;

    public static void main(String[] args) {

    }


    private static void copy(String src, String dst) throws IOException {
        
        try (InputStream in = new FileInputStream(src);
                 OutputStream out = new FileOutputStream(dst);){
           
         
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
           
        } 
    }
}

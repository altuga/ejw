package com.kodcu.question11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


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
public class ReadFile {

    public static void main(String[] args) throws Exception{

    }


    private static String firstLineOfFile(String path) throws IOException {

       
        try( BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } finally {
           
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.question08.solution;

/**
 *
 * @author altuga
 */
public class Rectange implements Figure{
    
    private long width, length;

    public Rectange(long width, long lenght) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
    
    
    
}

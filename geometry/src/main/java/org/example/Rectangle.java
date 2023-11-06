package org.example;

public class Rectangle {

    public Integer computeArea(int length, int breadth) {
        if(length < 0 || breadth < 0){
            throw new NumberFormatException("Positive Number are allowed");
        }
        return length*breadth;
    }
}

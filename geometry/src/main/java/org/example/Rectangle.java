package org.example;

import java.math.BigInteger;

public class Rectangle {

    public BigInteger computeArea(int length, int breadth) {
        if(length < 0 || breadth < 0){
            throw new NumberFormatException("Positive Number are allowed");
        }
        return BigInteger.valueOf(length*breadth);
    }
}

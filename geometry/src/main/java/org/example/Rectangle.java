package org.example;

import java.math.BigInteger;

public class Rectangle {
    public static final String POSTIVE_NUM_EXCEPTION = "Positive Number are allowed";

    public BigInteger calculateArea(int length, int breadth) {
        if(length < 0 || breadth < 0){
            throw new NumberFormatException(POSTIVE_NUM_EXCEPTION);
        }
        return BigInteger.valueOf(length*breadth);
    }
}

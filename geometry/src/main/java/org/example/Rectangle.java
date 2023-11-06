package org.example;

import java.math.BigInteger;

public class Rectangle {
    public static final String POSTIVE_NUM_EXCEPTION = "Positive Number are allowed";
    
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        if(length <= 0 || breadth <= 0){
            throw new NumberFormatException(POSTIVE_NUM_EXCEPTION);
        }
    }
    public BigInteger calculateArea() {
        return BigInteger.valueOf(length*breadth);
    }
    public BigInteger calculatePerimeter() {
        return BigInteger.valueOf(2*(length+breadth));
    }
}

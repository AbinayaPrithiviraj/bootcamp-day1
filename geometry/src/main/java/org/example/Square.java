package org.example;
import java.math.BigInteger;

public class Square extends Shape{
    private final int side;

    public Square(int side) {
        this.side = side;
        if(side <= 0){
            throw new NumberFormatException(POSTIVE_NUM_EXCEPTION);
        }
    }

    public BigInteger calculateArea() {
        return BigInteger.valueOf(side * side);
    }

    public BigInteger calculatePerimeter() {
        return BigInteger.valueOf(4*side);
    }
    
}

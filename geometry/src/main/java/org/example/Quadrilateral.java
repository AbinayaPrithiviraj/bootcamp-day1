package org.example;

import java.math.BigInteger;

public abstract class Quadrilateral {
    public static final String POSTIVE_NUM_EXCEPTION = "Positive Number are allowed";
    public abstract BigInteger calculateArea();
    public abstract BigInteger calculatePerimeter();
}


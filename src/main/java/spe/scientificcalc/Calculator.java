package spe.scientificcalc;

import java.lang.Math;

public class Calculator {
    public double squareRoot(double n) {
        if (n < 0) {
            throw new ArithmeticException(n + " is negative");
        }
        return Math.sqrt(n);
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException(n + " is negative");
        }
        long fact = 1;
        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
        return fact;
    }

    public double naturalLog(double x) {
        if (x < 0) {
            throw new ArithmeticException(x + " is negative");
        }
        return Math.log1p(x);
    }

    public double power(double b, double e) {
        return Math.pow(b,e);
    }
}

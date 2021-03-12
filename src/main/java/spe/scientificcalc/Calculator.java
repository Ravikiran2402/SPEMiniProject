package spe.scientificcalc;

import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private final static Logger logger = LogManager.getLogger();
    
    public double squareRoot(double n) {
        logger.info("[SQRT_FUNC - Request] : "+n);
        if (n < 0) {
            logger.info("[SQRT_FUNC - Invalid Request] : "+n);
            throw new ArithmeticException(n + " is negative");
        }
        double ret_val = Math.sqrt(n);
        logger.info("[SQRT_FUNC - Response] : "+ret_val);
        return ret_val;
    }

    public long factorial(int n) {
        logger.info("[FACTORIAL_FUNC - Request] : "+n);
        if (n < 0) {
            logger.info("[FACTORIAL_FUNC - Invalid Request] : "+n);
            throw new ArithmeticException(n + " is negative");
        }
        long fact = 1;
        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
        logger.info("[FACTORIAL_FUNC - Response] : "+fact);
        return fact;
    }

    public double naturalLog(double x) {
        logger.info("[LOG_FUNC - Request] : "+x);
        if (x < 0) {
            logger.info("[LOG_FUNC - Invalid Request] : "+x);
            throw new ArithmeticException(x + " is negative");
        }
        double ret_val = Math.log1p(x);
        logger.info("[LOG_FUNC - Response] : "+ret_val);
        return ret_val;
    }

    public double power(double b, double e) {
        logger.info("[POWER_FUNC - Request] : ("+b+","+e+")");
        double ret_val = Math.pow(b,e);
        logger.info("[POWER_FUNC - Response] : "+ret_val);
        return ret_val;
    }
}

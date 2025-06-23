class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Division by zero is not allowed.");
        return a / b;
    }

    public double modulus(double a, double b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Modulus by zero is not allowed.");
        return a % b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double a) throws ArithmeticException {
        if (a < 0)
            throw new ArithmeticException("Square root of negative number not allowed.");
        return Math.sqrt(a);
    }

    public double cbrt(double a) throws ArithmeticException {
        if (a < 0)
            throw new ArithmeticException("Square root of negative number not allowed.");
        return Math.cbrt(a);
    }
}

package atu.ie;

public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    public int subtract(int a, int b) {
        int result = a - b;
        if (result < 0) {
            throw new IllegalStateException("Negative result not allowed.");
        }
        return result;
    }
}

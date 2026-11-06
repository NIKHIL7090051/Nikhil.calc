package calculator.advanced;

public final class Eqn {
    private Eqn() {
        // Prevent objects from being created.
    }

    public static double solve(double a, double b) {
        if (a == 0) {
            throw new ArithmeticException("Coefficient a cannot be zero.");
        }
        return -b / a;
    }
}

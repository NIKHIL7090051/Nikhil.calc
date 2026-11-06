package calculator.advanced;

public final class Matrix {
    private Matrix() {
        // Prevent objects from being created.
    }

    public static void add(double[][] a, double[][] b) {
        System.out.println("Matrix addition result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }
}

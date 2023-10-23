public class EX8{

    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}

package problem2;

public class Problem2 {

    public static void main(String[] args) {
        int limit = 4000000;
        int prev = 0;
        int beforeprev = 1;
        int sum = 0;
        int fib = prev + beforeprev;

        do {
            if (fib % 2 == 0) {
                sum += fib;
            }
            fib = prev + beforeprev;
            beforeprev = prev;
            prev = fib;
        } while (fib < limit);
        System.out.println(sum);
    }
}
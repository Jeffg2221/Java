public static void main(String[] args) {
    long start = System.currentTimeMillis();
    Integer sum = 0;
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
        sum += i;
    }
    System.out.println("Sum: " + sum);
    long end = System.currentTimeMillis();
    double total = (double) (end - start) / 1000;
    System.out.println("Time of execution: " + total + " seconds");
}
Sum: 1073741825
Time of execution: 6.477 seconds


public static void main(String[] args) {
    long start = System.currentTimeMillis();
    int sum = 0;
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
        sum += i;
    }
    System.out.println("Sum: " + sum);
    long end = System.currentTimeMillis();
    double total = (double) (end - start) / 1000;
    System.out.println("Time of execution: " + total + " seconds");
}
Sum: 1073741825
Time of execution: 0.763 seconds

public class TestNull {
    public static void main(String[] args) {
        Integer a = 10;
        int b = 10;
        a = null;
        b = null;
    }
}


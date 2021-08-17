import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        for (long i = a + 1; i < b; i++) {
            a *= i;


        }
        System.out.println(a);
    }
}

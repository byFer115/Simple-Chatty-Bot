import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        boolean b = scanner.nextBoolean();

        boolean d = (a>=10 && a<=20 && !b) || (a>=15 && a<=25 && b);

        System.out.println(d);


    }
}
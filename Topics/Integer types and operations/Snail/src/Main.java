import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int g = 0;
        int cont = 0;

        while (g <= h) {
            g += a;
            cont++;
            if (g >= h) {
                break;
            }
            g -= b;

        }
        System.out.println(cont);




    }
}

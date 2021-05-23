import java.util.Scanner;

public class ReverseTriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        if (n >= 0 && n <= 30) {
            try {
                int empty = 0;
                int copy = 30;
                for (int i = 0; i < copy; i++) {
                    for (int j = 0; j < empty; j++) {
                        System.out.printf("  ");
                    }
                    for (int j = 1; j <= n; j++) {
                        System.out.printf("%d ", j);
                    }
                    System.out.println();
                    n--;
                    empty++;
                }
            } catch (Exception e) {
                System.out.println("Incorrect input");
            }
        }
        else System.out.println("Incorrect input");
    }
}
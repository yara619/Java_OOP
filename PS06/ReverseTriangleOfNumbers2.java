import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseTriangleOfNumbers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N;
        try{
            N = input.nextInt();
            if(N> 30 || N < 0){
                System.out.println("out of range");
                return;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Incorrect input");
            return;
        }

        triangle(N);


    }

    public static void triangle(int n){
        for (int line = 1; line <= n; line++){
            int start=0;
            for (int elements = 1; elements <= n; elements++ ){
                if (elements < line){
                    System.out.print("  ");
                    start+=1;
                }
                else {
                    System.out.printf("%d ", elements - start);
                }
            }
            System.out.println("");
        }
    }
}
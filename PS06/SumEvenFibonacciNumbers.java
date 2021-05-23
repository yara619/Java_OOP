import java.util.Scanner;

public class SumEvenFibonacciNumbers {
    // add your code here
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        if (limit > 1 && limit <= 1000){
            if(limit == 2){
                System.out.println("2");
                return;
            }
            if(limit<3){
                System.out.println(0);
            }
            else{
                int first = 1, second = 2;
                int third = 3;
                int sum = 2;
                while (third< limit){
                    if (third%2 == 0){
                        sum+= third;
                    }
                    first=second;
                    second = third;
                    third = first + second;
                }
                System.out.printf("%d", sum);
            }

        }
        else System.out.println("Number out of range!");


    }
}
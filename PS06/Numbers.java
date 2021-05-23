import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // add your code here
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            int integer = input.nextInt();

            if (integer == 0){
                System.out.println("0 + 00 + 000 = 0");
                return;
            }

            if (integer < 0){
                integer*= -1;
            }

            int divisor = 10;
            int temp = integer;
             while(true){
                 if (temp < 10){
                     break;
                 }
                 else {
                     divisor*= 10;
                     temp = temp/divisor;
                 }
             }

             int first = integer;
             int second = integer + divisor*integer;
             int third = second*divisor + integer;




            System.out.printf("%d + %d + %d = %d", first, second, third, first+second+third );
        }
        else{
            System.out.println("error");
        }




    }
}
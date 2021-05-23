import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        long binary1 = input.nextLong();
        System.out.print("Input second binary number: ");
        long binary2 = input.nextLong();

        System.out.println("Sum of two binary numbers: "+ binaryAddition(binary1, binary2));


    }

    public static int binaryAddition(long binary1, long binary2){
        String result = "";
        long bAdd = 0;

        while ( binary1 != 0 || binary2 != 0){
            long check = (binary1%10 + binary2%10 + bAdd) % 2;
            result += (check);
            bAdd = (binary1%10 + binary2%10 + bAdd) / 2;
            binary1=binary1/10;
            binary2=binary2/10;
        }

        if (bAdd != 0){
            result+=(bAdd);
        }

        String res2 = "";

        for (int i= result.length()-1; i>=0; i--){
            res2 += result.charAt(i);
        }

        return Integer.parseInt(res2);

    }
}

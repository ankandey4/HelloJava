package HelloJava;
import java.util.Scanner;

public class multplication {
    public static void main(String[] arge){
        Scanner input = new Scanner(System.in);
        System.out.print("enter first integer:\n");
        int a = input.nextInt();
        System.out.print("enter second enteger:\n");
        int b = input.nextInt();
        int c = a * b;
        System.out.print(c);
        input.close();


    }
}

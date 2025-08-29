package HelloJava;

import java.util.Scanner;

public class squre {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("enter the number: ");
        a = input.nextInt();
        
        int b = a*a;
        System.out.println("The value of " +a +" squer is " +b);

        input.close();

    }

}

package HelloJava;

import java.util.Scanner;

public class sumOFtwoInt {
    public static void main(String[] args){

        Scanner input1 = new Scanner(System.in);
        int a;
        a = input1.nextInt();
        int b;
        b = input1.nextInt();

        int c = a + b;

        System.out.println(c);
        
        input1.close();
    }

}

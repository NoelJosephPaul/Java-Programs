/*Write a Java program to find sum, difference, product,
quotient and reminder of two numbers. Input the two numbers.*/
import java.util.Scanner;
public class arithop
{
    public static void main(String args[])
    {   
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a+b;
        int diff =a-b;
        int prod=a*b;
        int quotient = a/b;
        int rem = a%b;
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+diff);
        System.out.println("Product = "+prod);
        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+rem);
    }
}
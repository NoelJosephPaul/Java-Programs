/*Write a Java program to find sum, difference, product,
quotient and reminder of two numbers.
*/
class arithoperations
{
    public static void main(String args[])
    {
        int a=10,b=20;
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
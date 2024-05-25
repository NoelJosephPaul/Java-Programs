import java.util.Scanner;
class box
{
    int length;
    int breadth;
    int height;
}
public class boxvolume
{
    public static void main(String[] args)
    {
        box b1=new box();
        box b2=new box();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of Box 1:");
        b1.length=sc.nextInt();
        System.out.print("Enter breadth of Box 1:");
        b1.breadth=sc.nextInt();
        System.out.print("Enter height of Box 1:");
        b1.height=sc.nextInt();
        System.out.print("\nEnter length of Box 2:");
        b2.length=sc.nextInt();
        System.out.print("Enter breadth of Box 2:");
        b2.breadth=sc.nextInt();
        System.out.print("Enter height of Box 2:");
        b2.height=sc.nextInt();
        sc.close();
        int v1=b1.length*b1.breadth*b1.height;
        int v2=b2.length*b2.breadth*b2.height;
        System.out.print("\nThe volume of Box 1: "+v1+"cm^3"+"\nThe volume of Box 2: "+v2+"cm^3");
    } 
    
}

import java.util.Scanner;
public class arraysum 
{
    public static void main(String[] args)
    {
        int n,sum=0;
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter the size of array: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        sc.close();
        System.out.print("The sum of array elements: "+sum);

    }    
}

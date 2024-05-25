import java.io.*;
import java.util.Scanner;
public class atmbank
{
    static int accountnumber;
    
    static void deposit(int amt)
    {
        try
        {
            int balance =0;
            File acc =new File(accountnumber+".txt");
            if(acc.exists())
            {
                BufferedReader br=new BufferedReader(new FileReader(acc));
                balance =Integer.parseInt(br.readLine());
                br.close();
            }
            else if(acc.createNewFile())
            {
                System.out.println("Account is created");
            }
            BufferedWriter bw=new BufferedWriter(new FileWriter(accountnumber+".txt"));
            bw.write(((Integer)(amt+balance)).toString());
            System.out.println("Amount credited");
            bw.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            print();
        }
    }

    static void withdraw(int amt)
    {
        try
        {
            File acc=new File(accountnumber+".txt");
            if(!acc.exists())
            {
                throw new UserException("Account not found");
            }
            else
            {
                BufferedReader br=new BufferedReader(new FileReader(acc));
                int balance =Integer.parseInt(br.readLine());
                br.close(); 
                if(balance<amt)  
                    throw new UserException("Insufficient funds");
                else
                {
                    BufferedWriter bw=new BufferedWriter(new FileWriter(accountnumber+".txt"));
                    bw.write(((Integer)(balance-amt)).toString());
                    System.out.println("Amount Debited");
                    bw.close();
                }

            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            print();
        }

    }

    static void print()
    {
        try{
            File acc=new File(accountnumber+".txt");
            BufferedReader br=new BufferedReader(new FileReader(acc));
        
            if((acc.exists()))
            {
                
                int balance =Integer.parseInt(br.readLine());
                System.out.println("Balance: "+balance);
                br.close();

            }
            else
            {
                br.close();
                throw new UserException("File not found");
                
            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
        
        }

        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ATM Transactions");
        System.out.print("\nEnter account number: ");
        accountnumber=sc.nextInt();
        int choice,amount;
        do
        {
            System.out.print("\n1.Deposit\n2.Withdraw\n3.Display Balance\n4.Exit\nEnter choice: ");
            choice=sc.nextInt();amount =0;
            switch(choice)
            {
                case 1: 
                    System.out.print("\nEnter amount to deposit: ");
                    amount =sc.nextInt();
                    deposit(amount);
                    break;
                case 2:
                    System.out.print("\nEnter amount to withdraw: ");
                    amount =sc.nextInt();
                    withdraw(amount);
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    System.out.println("\nThank you for using SBI ATM");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=4);
        sc.close();
    }    
}

class UserException extends Exception{
    public  UserException(String s)
    {
        super(s);
    }
}

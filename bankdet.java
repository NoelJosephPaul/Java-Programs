class account
{
	public String accno;
	public String name;
	public double balance;	

}

public class bankdet
{
	
	public static void main(String[] args)
	{
		account ac=new account();
		ac.accno="334455";
		ac.name="Noel Joseph Paul";
		ac.balance=50000;
		System.out.println("AccNo  : "+ac.accno+"\nName   : "+ac.name+"\nBalance: Rs "+ac.balance);
	}
}

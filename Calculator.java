import javax.swing.*;
import java.awt.event.*;
class Calculator extends JFrame implements ActionListener
{
	JButton ad, mu, sub,div;
	JTextField num1, num2, res;
	JLabel ip, op;
	Calculator()
	{
		super("Noel Joseph - Calculator");
		ad = new JButton("Add");
		mu = new JButton("Mul");
		sub = new JButton("Sub");
		div=new JButton("Div");
		num1 =new JTextField(10);
		num2 =new JTextField(10);
		res = new JTextField(10);
		ip = new JLabel("Input");
		op = new JLabel("Output");
		add(ad);
		add(mu);
		add(sub);
		add(div);
		add(num1);
		add(num2);
		add(res);
		add(ip);
		add(op);
		setLayout(null);
		ip.setBounds(10, 30, 100, 20);
		num1.setBounds(20, 60, 100, 20);
		num2.setBounds(20, 90, 100, 20);
		op.setBounds(10, 150, 100, 20);
		res.setBounds(20, 180, 100, 20);
		ad.setBounds(200, 10, 100, 42);
		mu.setBounds(200, 150, 100, 42);
		sub.setBounds(200, 80, 100, 42);
		div.setBounds(200, 220,100,42);
		setSize(500, 300);
		setVisible(true);
		ad.addActionListener(this);
		mu.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1, n2, result;
		String strnum1=num1.getText();
		n1=Integer.parseInt(strnum1);
		String strnum2=num2.getText();
		n2=Integer.parseInt(strnum2);
		Object source = ae.getSource();

		if(source==ad)
		{
			result=n1+n2;
			res.setText(Integer.toString(result));
		}
		else if(source==mu)
		{
			result=n1*n2;
			res.setText(Integer.toString(result));
		}
		else if(source==sub)
		{
			result=n1-n2;
			res.setText(Integer.toString(result));
		}
		else 
		{
			try{
			result=n1/n2;
			res.setText(Integer.toString(result));
			}
			catch(ArithmeticException e)
			{
				res.setText("Div by Zero");
			}
		}
	}
	public static void main(String args[])
	{
		Calculator obj = new Calculator();
	}
}

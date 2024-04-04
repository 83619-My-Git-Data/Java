package P1;
import java.util.*;
public class InvoiceTest {

	public static void main(String[] args) {
		
		
		
		String partno;
		String partdesc;
		int quant;
		double price;
		double bill;
		int i=1;

		while(i!=0)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the part no. ");
		partno=sc.next();
		System.out.println("Enter the partdesc ");
		partdesc=sc.next();
		System.out.println("Enter the  quant");
		quant=sc.nextInt();
		if(quant<0)
			quant=0;
		System.out.println("Enter the  price");
		price=sc.nextDouble();
		if(price<0)
			price=0;
		Invoice i1= new Invoice(partno,partdesc,quant,price);
		
		bill=i1.Calculate();
		System.out.println("The total bill is " + bill);
		
		System.out.println("Do you wish to continue? enter 1 else enter 0");
		i=sc.nextInt();
		if(i==0)
			break;
		else
			continue;
		}

	}

}

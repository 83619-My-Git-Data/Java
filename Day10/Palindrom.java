

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) 
	{
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		name=sc.next();
		
		String revName;
		revName="";
		char ch;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			ch=name.charAt(i);
			revName=revName+ch; //sequence of addition matters 
			//revName=revName+ch;
		}
		
		if(name.equals(revName))
		{
			System.out.println("The string is palindrome --> "+name);
		}
		else
			System.out.println("The string is not palindrome ");
       sc.close();

	}

}

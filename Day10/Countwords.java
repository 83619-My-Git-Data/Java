import java.util.Scanner;

public class Countwords {

	public static void main(String[] args) 
	{
	String statement;
	Scanner sc=new Scanner(System.in);
	int index=0;
	
	System.out.println("Please enter the statement ");
	statement=sc.nextLine();
	
	String s[]=statement.split(" ");
	
	for(String State:s)
	{
		System.out.println(State);
		index++;
	}
	
	System.out.println("The number of words in given string are "+index);
	

	}

}

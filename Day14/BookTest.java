package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Set<Book> bl = new HashSet<>();
		
		int choice;
		
		do {
            System.out.println("\nMenu:");
            System.out.println("1. Accept book details and add in collection");
            System.out.println("2. Display all books from collection");
            System.out.println("3. Sort the book details as per category and display it");
            System.out.println("4. Sort the book details as per author and display it");
            System.out.println("5. Find book by id");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice)
            {
            case 1:
            	Book b= new Book();
            	b.acceptData();
            	bl.add(b);
            	break;
            case 2:
            	for (Book book : bl) {
					System.out.println(book);
				}
            case 3:
            	List<Book> br= new ArrayList<>();
            	for (Book book : bl) {
            		br.add(book);
            		break;
            	}
				 class CategoryComp implements Comparator<Book>
				 {

					@Override
					public int compare(Book o1, Book o2) {
						
						
						return o1.getCat().compareTo(o2.getCat());
					}
					 
				 }
				 
				 Comparator<Book> bookCatComp = new CategoryComp();
				 Collections.sort(br,bookCatComp);
				 
				 for (Book book : br) {
					 
					 System.out.println(book);	
				}
				 break;
            case 4:
            	List<Book> bo= new ArrayList<>();
            	for (Book book : bl) {
            		bo.add(book);
            		break;
            	}
				 class AuthorComp implements Comparator<Book>
				 {

					@Override
					public int compare(Book o1, Book o2) {
						
						
						return o1.getAuthorName().compareTo(o2.getAuthorName());
					}
					 
				 }
				 
				 Comparator<Book> bookAuthComp = new AuthorComp();
				 Collections.sort(bo,bookAuthComp);
				 
				 for (Book book : bo) {
					 
					 System.out.println(book);	
				}
            	break;
            case 5:
            	System.out.println("Enter the id of the book - ");
				String find = sc.next();
				Book b2 = new Book();
				b2.setIsbn(find);

				if (bl.contains(b2))
					System.out.println("Book fetched - \n" + bl.toString());
				else
					System.out.println("Book does not exist");
				break;
 
				}
            
            }while(choice!=6);
		

	}

}

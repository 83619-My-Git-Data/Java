package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;



public class Book implements Comparable<Book>{
	
	
	enum Category{
		horror,
		comedy,
		romance
	}
	
	Scanner sc = new Scanner(System.in);
	String isbn;
	double price;
	String authorName;
	int quantity;
	Category cat;
	
	public Book() {}
	
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public void acceptData()
	{
		
		System.out.println("Enter the isbn");
		isbn=sc.next();
		System.out.println("Enter the price");
		price=sc.nextDouble();
		System.out.println("Enter the authorName");
		authorName=sc.next();
		System.out.println("Enter the quantity");
		quantity=sc.nextInt();
		System.out.println("Enter the Book Category Including horror or comedy or romance");
		cat = Category.valueOf(sc.next());
		
	}
	public Category getCat() {
		return cat;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setCat(Category cat) {
		this.cat = cat;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	public String getIsbn() {
		return isbn;
	}
	public double getPrice() {
		return price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public int getQuantity() {
		return quantity;
	}

	@Override
	public int compareTo(Book o) {
		
		return this.isbn.compareTo(o.isbn);
	}
	
	
	
	

}

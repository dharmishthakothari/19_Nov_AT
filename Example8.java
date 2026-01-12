package com.pkgCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Book
{
	int price,pages;
	String title;
	int isbn;
	public Book(int isbn,String title,int pages,int price)
	{
		this.title=title;
		this.isbn=isbn;
		this.pages=pages;
		this.price=price;
	}
	public void display()
	{
		System.out.println(isbn+"\t"+title+"\t"+pages+"\t"+price);
	}
}

public class Example8 {

	public void viewAllBooks(ArrayList<Book> bList)
	{
		Iterator<Book> i=bList.iterator();
		while(i.hasNext())
		{
			Book b=i.next();
			b.display();
		}
	}
	
	public ArrayList addBook(ArrayList<Book> bList)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter title ");
		String title=scan.next();
		System.out.println("Enter ISBN ");
		int isbn=scan.nextInt();
		System.out.println("Enter price");
		int price=scan.nextInt();
		System.out.println("Enter pages ");
		int pages=scan.nextInt();
		bList.add(new Book(isbn,title,pages,price));
		
		return bList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int choice;
		ArrayList<Book> bookList=new ArrayList<Book>();

		do
		{
			System.out.println("1. Add Book");
			System.out.println("2. Update Book");
			System.out.println("3. Search Book");
			System.out.println("4. View all Book");
			System.out.println("5. Exit");
			System.out.println("Enter your choice ");
			choice=scan.nextInt();
			Example8 obj=new Example8();
			switch (choice) {
			case 1: {
					bookList=obj.addBook(bookList);
					System.out.println("Book added successfully");
					break;
			}
			case 4:
			{
					obj.viewAllBooks(bookList);
					break;
			}
			case 5:break;
			}
			
		}while(choice!=5);
		
		
		
//		bookList.add(new Book(1,"autoamation",230,300));
//		bookList.add(new Book(2,"Selenium",230,300));
//		bookList.add(new Book(3,"Motivation",230,200));
//		bookList.add(new Book(4,"Novel",230,310));
		
//		Iterator<Book> i=bookList.iterator();
//		while(i.hasNext())
//		{
//			Book b=i.next();
//			b.display();
//		}
		
	}

}

package Juned;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner; 
import java.util.Collections; 

public class Library 
{


	static ArrayList <Book> Library1 = new ArrayList<Book>();
	static ArrayList <String> Library2 = new ArrayList <String> (); 
	
	public static String status;
	public static String borrower; 
	public static String borrowDate; 
	public static String returnDate; 
	public String status1 = "Available";
	public String status2 = "Borrowed";
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int choice = 0;
		System.out.println("******Welcome to the Public Library!****");
		System.out.println("  Please Select From The Following Options:               ");
	
		while(choice != 9)
		{
			
			System.out.println("1: Add new book");
			System.out.println("2: Dispaly Available Book in Library1");
			System.out.println("3: Search");
			System.out.println("4: Borrow Book");
			System.out.println("5: Exit");
			choice = input.nextInt();

			
		switch(choice)
		{
		case 1: 
			System.out.print("Enter Book name: ");
			String title = input.next();
			

			Library1.add(new Book(title)); 
			System.out.println("-----You have successfully added a new Book!-----");
			break; 
		case 2:
			ListIterator<Book> it = Library1.listIterator();
			System.out.println("Available Books are are");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		    break; 
		case 3:
			Book.Search(); 
			break; 
		
		
		case 4:
			Book.Bookborrow();
			break;
			
		case 5:
			break;
			
			}while(choice!=6);
		}
	}
}
package Juned;



import java.util.ArrayList;
import java.util.Scanner;

public class Book
{
	Scanner input = new Scanner(System.in);
	private String title; 
	 
	int bookCount = 0;	//amount books user has in pocket
	int books = 0;
	
	
	//constructor to "add new patron" by entering their name. 
	public Book(String title)
	{
	   this.title = title; 
		this.title = title; 
	}
	
	public String toString()
	{
		return title; 
	}
	
	public String getName() 
	{
		return title; 
	}

		
	
	public static void Search()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter book title to be Search ");
		
		String bookCheckIn = input.next(); 
		if(Library.Library1.contains(bookCheckIn))
		{
			
			System.out.println(bookCheckIn + " is not in the library. Please enter "
					+ "a different book to be checked out");
			}	
		
			else
			{
				System.out.println("-----" + bookCheckIn + "Book  Available in library");	
			}
	}
	public static void  Bookborrow()
	{
		Scanner input = new Scanner(System.in);
		String title;
		System.out.println("Enter title of book");
		title=input.next();
	
		Library.Library1.contains(title);
		
		System.out.println("You are  borrow the Book"+" "+title+" "+"Sucessfully");
		
		
		
	}
	
	public boolean canBorrow()
	{
		if(bookCount <= 3)
		{
			return true; 
		} 
		else 
		{
			return false; 
		}
	}

}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.sql.RowSetInternal;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.jdbc.Driver");
		 
		Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/juneddb","root","");
		
		Statement stmt=con.createStatement();
		
		PreparedStatement ps=null;
		
		int rno=0;
		
		String title;
		
		float marks=0;
		
		String query=null;
		while(true)
		{
			System.out.println("1:Add New Book\n2:Available Books\n3Search and Borrow\n4Return Books");
			
			System.out.println("Enter your choice");
			
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Book Name");
				
				
				title=sc.next();
				
				query="insert into Books values(?)";
				ps=con.prepareStatement(query);
				ps.setString(1, title);
				ps.executeUpdate();
				break;
				
			case 2: 
		         System.out.println("The Available Books are:");
		         int rowCount = 0;
		         ResultSet rs = stmt.executeQuery("select * from books");
		       
		         while(rs.next()) {  
		            String title1 = rs.getString("Book_name");  // retrieve a 'String'-cell in the row
		              
		            System.out.println("Available Books are: "+title1);
		            ++rowCount;
		         }
				break;
				
			case 3:
				 try {
			  
			        System.out.println("Enter title of book");
			        title=sc.next();
			        query = "select * from Books where Book_name=?";
		            ps= con.prepareStatement(query);
		            ps.setString(1, title);
		            rs = ps.executeQuery();
		        	
					  if (rs.next()) {
			               
			             String title1 = rs.getString("Book_name");
			              System.out.println("You are  borrow the Book"+" "+title1+" "+"Sucessfully");
			            }
			        }
			 
			       catch (SQLException e) {
			 
			           
			            System.out.println(e);
			        }
			    
				
				
				break;
				
			case 4:
				System.out.println("Enter title of book ");
			    title=sc.next();

				query="insert into Books values(?)";
				ps=con.prepareStatement(query);
				ps.setString(1, title);
				ps.executeUpdate();
				System.out.println("Return Book Successfully");
				
			    break;
				
			default:
				
				System.exit(0);
			}
			
			
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

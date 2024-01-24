package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementsExa {
	
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	public PreparedStatementsExa() throws ClassNotFoundException, SQLException
	{
		connection = MyConnection.getMyConnection();
		System.out.println("Connection is established .");
	}
	
	public void insertRecord(int id,String name,String email,int age,String city) throws SQLException
	{
		preparedStatement=connection.prepareStatement("insert into person values(?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, email);
		preparedStatement.setInt(4, age);
		preparedStatement.setString(5, city);
		
		int n=preparedStatement.executeUpdate();
		System.out.println(n+" record is inserted .");
	}
	
	public void searchByCity(String city) throws SQLException
	{
		preparedStatement=connection.prepareStatement("select * from person where city =?");
		preparedStatement.setString(1,city);
		resultSet =preparedStatement.executeQuery();
		while(resultSet.next())
		{
			System.out.print(resultSet.getInt("pid")+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getString(3)+"\t\t");
			System.out.print(resultSet.getInt(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.println();
		}
	}
	
	public void updateRecord(String city,int id) throws SQLException
	{
		preparedStatement=connection.prepareStatement("update person set city =? where pid =? ");
		preparedStatement.setString(1, city);
		preparedStatement.setInt(2, id);
		int n= preparedStatement.executeUpdate();
		System.out.println(n+ " record Updated");
	}
	
	public void deleteRecord(int id) throws SQLException
	{//delete  from person where pid=107;
		preparedStatement=connection.prepareStatement("delete from person  where pid =? ");
		preparedStatement.setInt(1, id);
		int n= preparedStatement.executeUpdate();
		System.out.println(n+ " record Deleted");
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		PreparedStatementsExa demo=new PreparedStatementsExa();
		int id ,age;
		String name, email, city;
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("Enter Your Choice .\n 1.insert new Records\n 2.Update Records\n 3.Search By city\n 4. delete By Id");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1 : 
		
				System.out.println("-------------------Insert Data--------------------");
				
				System.out.println("Enetr id : ");
				id=sc.nextInt();
				System.out.println("Enetr name : ");
				name=sc.nextLine();
				name=sc.nextLine();
				System.out.println("Enetr email : ");
				email=sc.nextLine();
				System.out.println("Enetr city : ");
				city=sc.nextLine();
				System.out.println("Enetr age : ");
				age=sc.nextInt();
				
				demo.insertRecord(id, name, email, age, city);
				break;
		
		case 2 : 
				System.out.println("-------------------Search Data--------------------");
				System.out.println("Enter City for Search : ");
				city=sc.nextLine();
				city=sc.nextLine();
				System.out.println("Search By city : "+city);
				demo.searchByCity(city);
				break;
		case 3 : 
				System.out.println("-------------------Update Data--------------------");
				System.out.println("Enetr id : ");
				id=sc.nextInt();
				System.out.println("Enetr name : ");
				name=sc.next();
				demo.updateRecord(name, id);
				break;
				
		case 4 : 
				System.out.println("-------------------Dalete Data--------------------");
				System.out.println("Enetr id : ");
				id=sc.nextInt();
				demo.deleteRecord(id);
				break;
				
		default : System.out.println("Invalid Parameter");
		}
		}while(choice !=0);
	}
}

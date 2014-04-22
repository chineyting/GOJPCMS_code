package AclComponent;
import java.sql.*;

public class DbConnect {
	private Connection con;
	private Statement st;
	private ResultSet rs;

	public DbConnect() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gojpcms","root","");
			st = con.createStatement();
			
		}catch(Exception e){
			System.out.println("Error: "+e);
			
		}
	}
	public void getData(){
		try{
			String query = "SELECT * FROM users";
			rs = st.executeQuery(query);
			System.out.println("Records From Database:");
			while(rs.next()){
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String status = rs.getString("status");
				System.out.println("First Name: "+firstname+"\nLast Name: "+lastname+"\nStatus: "+status);
			}
			
		}catch(Exception e){
			System.out.println("Error: "+e);
		}
		
		
	}
	public static void main(String[] args){
    	DbConnect connect = new DbConnect();
    	connect.getData();
    }
}

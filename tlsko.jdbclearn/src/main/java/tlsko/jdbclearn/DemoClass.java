package tlsko.jdbclearn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoClass {

	public static void main(String[] args) throws Exception {
	
				String url="jdbc:mysql://localhost:3306/harshiniwork?autoReconnect=true&useSSL=false";
				
				String uname = "root";
				String pass="H@rshini93";
				//String query = "select studentName from tbl_student where studentID=2"; 
				//view the data from database
				//String query ="select * from tbl_student";
				//Fetch data from Database
				int studentID = 10;
				String studentName = "siri";
				int studentAge=32;
				//String query = "insert into tbl_student values (4,'Vinny',23)";
				//String query = "insert into tbl_student values (" + studentID + ",'" + studentName + ",'" + studentAge +"')";
				//String query = "insert into tbl_student values (" + studentID + ",'" + studentName + ",'" + studentAge + "')";
				String query = "insert into tbl_student values (?,?,?)"; 
				//<driver> com.mysql.cj.jdbc.Driver</driver>
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				//Statement st = con.createStatement();
				PreparedStatement st = con.prepareStatement(query);
				//For fetching and viewing data from database DQL
				//ResultSet rs = st.executeQuery(query);
				st.setInt(1, studentID);
				st.setString(2, studentName);
				st.setInt(3, studentAge);
				int count = st.executeUpdate();  //DML
				System.out.println(count + "row/s affected");
				
				//String userData = "";
				//Fetching Data From Database
				//while(rs.next())
				//{
				
				//String name = rs.getString("studentName");
				//userData=rs.getInt(1) + ":" +rs.getString(2) + ":" + rs.getInt(3);
				//System.out.println(userData);
				//}
				st.close();				
				con.close();
			}
	}



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.JdbcConnection;

public class Conexion {
	
	public static void main(String args[])
	
	{
	String url = "jdbc:mysql://localhost:3306/login";
	String user = "root";
	
	String password = "";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		String query = "Insert into persona(Rut, Nombre, Apellido, Telefono, FechaIngreso) values('12716389','Rodrigo','Arancibia', '64464921', '20-04-2023')";

		
		String query1 = "Insert into usuario(Rut, username, password) values('12716381','admin','12345')";
		Statement statement = connection.createStatement();
		statement.executeUpdate(query);
		statement.executeUpdate(query1);
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
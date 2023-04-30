package TestJunitConexion;
import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import static org.junit.Assert.*;



public class TesConnectionBD  {

	@Test
	public void testMain() {
		Connection conn = null;
	      try {
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
	         System.out.println("Conexion es exitosa a la base de datos ");
	        
	      } catch (Exception e) {
	    	  assertNotNull(conn);
	      } finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
	      }
	   }

}

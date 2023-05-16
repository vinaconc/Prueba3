	package com.servlet;
	
	import java.sql.Statement;
	import java.sql.Connection;
	import java.sql.Date;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.sql.Time;
	import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.LocalTime;
	import java.io.IOException;
	
	
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	import java.time.format.DateTimeFormatter;
	
	/**
	 * Servlet implementation class RegistrarHoraMascotaServlet
	 */
	
	
	@WebServlet("/Registrar")
	
	
	public class RegistrarHoraMascotaServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public RegistrarHoraMascotaServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	
		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			
	
	        
	    }
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			
			LocalDate fecha = LocalDate.now();
			LocalTime horaActual = LocalTime.now();
			Time hora = Time.valueOf(horaActual);
			    
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		    String fechaFormateada = fecha.format(formatter);
		    

			
			  final String url = "jdbc:mysql://localhost:3306/clinica";
			    final String user = "root";
			    final String password = "";
			    
	        // Crear el objeto de conexión y la consulta preparada
	        try 
	        {
	
	    		Class.forName("com.mysql.jdbc.Driver");
	    		Connection connection = DriverManager.getConnection(url, user, password);
	    		
	    
	
	    		int uidMascota =  Integer.parseInt(request.getParameter("idMascota"));
	    		String umascota =  request.getParameter("nombreMascota");
	    		int urutDuenno =  Integer.parseInt(request.getParameter("rutDuenno"));
	    		
	    		
	            String consulta = "INSERT INTO clinica.agenda (idMascota, nombreMascota, rutDuenno, hora, fecha) VALUES (?,?,?,?,?)";
	            PreparedStatement statement = connection.prepareStatement(consulta);
	            statement.setInt(1, uidMascota);
	
	            statement.setString(2,umascota);
	            
	            statement.setInt(3, urutDuenno);
	            
	            statement.setTime(4, hora);
	            
	            statement.setString(5, fechaFormateada);
	            
	           
	            
	            // Ejecutar la inserción
	            int filasInsertadas = statement.executeUpdate();
	            
	            if (filasInsertadas > 0) {
	                // Inserción exitosa
	                response.getWriter().println("Registro insertado correctamente");
	            } else {
	                // Inserción fallida
	                response.getWriter().println("Error al insertar el registro");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            response.getWriter().println("Error en la conexión o consulta SQL");
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }   }

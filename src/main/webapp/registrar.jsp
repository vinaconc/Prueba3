<%-- 
    Document   : index
    Created on : 07-oct-2022, 11:59:56
    Author     : RAA
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clínica</title>
    </head>
    <body>

        <c:import url = "opciones.jsp"/>

        <h2>Registrar Hora Mascota</h2>

        <form name="form2" method="post" action="Registrar" class="register-form" onsubmit = "return validavacio()"
							id="login-form">

  

           
            id Mascota: <input type ="text" name ="idMascota" id="idMascota" />
            Nombre Mascota: <input type ="text" name ="nombreMascota" id="nombreMascota" />
            
              Rut Dueño: <input type ="text" name ="rutDuenno" id="rutDuenno" />


            
                   
                    <input type ="submit" name="Reg" id="Reg" value ="Registrar"/>
        </form>
      
    </body>
</html>

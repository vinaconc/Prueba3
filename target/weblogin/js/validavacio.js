function validavacio(){
    var n1=document.forms["form1"]["Rut"].value;
    var n2=document.forms["form1"]["username"].value;
    var n3=document.forms["form1"]["password"].value;  
    
   
 
    if(n1=="" ||n2=="" ||n3==""){
    	swal("Sorry", "Falta ingresar datos", "images/failed.jpg")
            return false;
        }
}



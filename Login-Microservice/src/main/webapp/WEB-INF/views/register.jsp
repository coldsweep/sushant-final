<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 fieldset{
        border: 2px solid black;
        font-family: fantasy;
        box-shadow: 0 0 15px;
        border-radius:15px
        margin: 20px;
        padding: 20px;
        width: 300px;
        height:250px;
        background-color: black;
        color:white;
        text-align: center;
        }
        
legend{
        background-color: black;
        font-family:fantasy;
        color:white;
        border: 2px solid white;
        padding: 14px 25px;
        border-radius: 20px;
       } 
       
table {
	    align-items: center;    
}  
td{
padding: 10px;
}    
                
</style>
</head>
<body>
<h1> this is register page</h1>
<div>
      <form style="border: 5px black; background:" action="/set-user" method="post">
         
         <fieldset>
              <legend>REGISTERATION PAGE</legend>
                <table>
                      <tr>
                          <td>UserId</td>
                          <td>
                               <input type="number" name="UserId" value="" placeholder="Enter Your Userid">
                          </td>            
                      </tr>
                      <tr>
                          <td>NAME</td>
                          <td>
                               <input type="text" name="name" value="" placeholder="Enter your Name ">
                          </td>     
                      </tr>
                      <tr>
                          <td>Password</td>
                          <td>
                               <input type="password" name="password" value="" placeholder="Enter your Password ">
                          </td>
                      </tr>
                      <tr>
                          <td>
                               <input type="submit" value="Register"  style="color: orange;">
                          </td>
                      </tr>           
                </table>
         
         </fieldset>
      </form>
</div>
</body>
</html>
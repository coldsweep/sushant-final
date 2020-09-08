<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h2 style="text-align: center;">User Not found Please register and try Again !!!</h2>
      <input type="button" value="Register" onclick="gotoRegister()" style="color: orange;">
      
<script type="text/javascript">
function gotoRegister(){
	window.location.href="/register";
}
</script>      
</body>
</html>
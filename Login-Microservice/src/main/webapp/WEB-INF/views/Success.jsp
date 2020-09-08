<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User Successfully Created!! Kindly go and Login</h2>
<input type="submit" value="Sign-In" onclick="gotologin()" style=" color: green;">

<script type="text/javascript">
function gotologin(){
	window.location.href="/";
}
</script>
</body>
</html>
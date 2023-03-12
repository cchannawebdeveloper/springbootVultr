<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%-- <script src="<c:url value="/webjars/bootstrap/js/bootstrap.min.js"/>"></script> --%>
<script src="<c:url value="/webjars/jquery/3.4.1/jquery.min.js"/>"></script>
</head>
<body>

<h1>Hello JSP</h1>

<script type="text/javascript">
	$(document).ready(function() {
		//loadContries();


		jQuery.ajax({
			
			//	url: "https://catfact.ninja/fact",
			url: "http://143.198.172.49/api/v1/bcrypt_gnerate",
			contentType: "application/json; charset=utf-8",
			//url: "http://localhost:8080/api/v1/bcrypt_gnerate",  
			type: 'GET',  
			  success: function(data) { 
				  console.log("data=====",  data); 
			   // $("#para").html(data);                
			  }  
			});  
	});
</script>

</body>
</html>
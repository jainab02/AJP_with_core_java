<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Information</h2>

	<%-- Create a new instance of Student bean --%>
	<%
	Student student = new Student();
	%>

	<%-- Set the properties of the Student bean --%>
	<%
	student.setStudentName("John Doe");
	%>
	<%
	student.setEnrollmentNo("12345");
	%>
	<%
	student.setMobileNo("1234567890");
	%>
	<%
	student.setCpi(8.5);
	%>

	<%-- Display the properties of the Student bean --%>
	<p>
		Student Name:
		<%=student.getStudentName()%></p>
	<p>
		Enrollment No:
		<%=student.getEnrollmentNo()%></p>
	<p>
		Mobile No:
		<%=student.getMobileNo()%></p>
	<p>
		CPI:
		<%=student.getCpi()%></p>

</body>
</html>
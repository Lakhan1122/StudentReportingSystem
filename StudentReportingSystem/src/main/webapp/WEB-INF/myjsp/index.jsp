<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student reporting system</title>
</head>
<body>

<h1> Average marks of Students in a subject</h1>
<form method="post">
    <input type="text" name="subject" placeholder="Subject Name">
    <br>
   
    <button>Submit</button>
</form>




<h2>Average marks of Students in a subject : ${avgMarks}</h2>


 <h1>Average Percentage of  recent semester</h1>
<form method="post">
  
    <input type="number" name="semester" placeholder="Enter Semester">
    <br>
  
    <button>Submit</button>
</form>




<h2>Average Percentage of whole class in recent semester : ${avg}</h2>


<h1>Click top 2 Students</h1>
<form method="post">
    
    <button>Submit</button>
</form>

<h2>Top 2 Consistent Students across all semesters : ${top2}</h2>

</body>
</html>
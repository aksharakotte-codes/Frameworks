<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>

<body>

<h2>Student Registration Form</h2>

<form action="saveStudent" method="post">

    <label>First Name:</label>
    <input type="text" name="fname" required>
    <br><br>

    <label>Last Name:</label>
    <input type="text" name="lname" required>
    <br><br>

    <label>Email:</label>
    <input type="email" name="email" required>
    <br><br>

    <label>Age:</label>
    <input type="number" name="age" required>
    <br><br>

    <label>City:</label>
    <input type="text" name="city" required>
    <br><br>

    <label>State:</label>
    <input type="text" name="state" required>
    <br><br>

    <input type="submit" value="Save Student">

</form>

</body>
</html>
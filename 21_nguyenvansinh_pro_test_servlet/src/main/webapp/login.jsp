<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
        <form action="login">
            <table>
                <caption>Check Login</caption>
                <tr>
                    <td>
                        UserName
                        <input type="hidden" name="" value="UserName">
                    </td>
                    <td>
                        <input type="text" name="Uname" id="">
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <input type="password" name="Upass" id="">
                    </td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html;charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="champ" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <style>
        /* Basic styling */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        header {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            text-align: center;
        }

        header nav {
            display: flex;
            justify-content: right;
            gap: 20px;
        }

        header nav a {
            color: white;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        header nav a:hover {
            background-color: #45a049;
        }

        footer {
            background-color: #4CAF50;
            color: white;
            text-align: center;
            padding: 10px;
            position: relative;
            bottom: 0;
            width: 100%;
        }

        .content {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            height: 80vh;
            text-align: center;
        }

        .form-container {
            background-color: #f4f4f4;
            padding: 20px;
            border-radius: 8px;
            width: 300px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        .form-container input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .form-container button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .form-container button:hover {
            background-color: #45a049;
        }

        .form-container p {
            margin-top: 10px;
        }

        .form-container a {
            color: #4CAF50;
            text-decoration: none;
            font-size: 14px;
        }

        .form-container a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <header>
        <h1>Welcome to My Website</h1>
        <nav>
            <a href="#home">Home</a>
            <a href="#about">About Us</a>
            <a href="signUp.jsp">Sign Up</a>
            <a href="signIn.jsp">Sign In</a>
        </nav>
    </header>

    <div class="content">
        <div class="form-container">
            <h2>Sign In</h2>
            <h2>${NotFound}</h2>
            <form action="signInAction" method="POST">

                <input type="email" name="email" placeholder="Email" value="${email}" required>
                <input type="password" name="password" placeholder="Password" required>
                <button type="submit">Sign In</button>
            </form>
            <p>Don't have an account? <a href="signUp.jsp">Sign Up</a></p>
            <p><a href="forgotPassword.jsp">Forgot Password?</a></p>
        </div>
    </div>

    <footer>
        <p>© 2025 My Website</p>
    </footer>

</body>
</html>

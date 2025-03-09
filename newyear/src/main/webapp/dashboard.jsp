<%@ page language="java" contentType="text/html;charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Front Page</title>
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
            height: 80vh;
            text-align: center;
        }
    </style>
</head>
<body>

    <header>
        <h1>Dashboard</h1>
        <h1> Hello ${firstName} !!!</h1>
        <nav>
            <a href="#home">Home</a>
            <a href="#about">About Us</a>
            <a href="signUp.jsp">Sign Up</a>
            <a href="fetch/${updateKey.getEmail()}">Update</a>
        </nav>
    </header>

    <div class="content">

"Unlock your potential with our interactive learning app, where personalized courses and engaging content help you master new skills at your own pace."    </div>

    <footer>
        <p>© 2025 My Website</p>
    </footer>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register - Recozilla</title>
    <!-- Bootstrap CDN link -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f2f2f2;
            padding-top: 50px;
        }

        .container {
            background-color: #ffffff;
            border-radius: 10px;
            padding: 40px;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
        }

        .alert-custom {
            background-color: #4CAF50;
            color: white;
            font-size: 1.2rem;
            text-align: center;
        }

        .heading {
            color: #004080;
            font-size: 2rem;
        }

        h4 {
            color: #333;
            font-size: 1.5rem;
            margin-top: 20px;
            text-align: center;
        }

        .btn-redirect {
            display: block;
            width: 20%;
            margin-top: 20px;
            margin-left: 422px
        }
    </style>
</head>
<body>

    <div class="container">
        <div class="alert alert-custom">
            <h1 class="heading">${ key1 } Thank You for Registering!</h1>

        </div>
        <!-- Redirect Button -->
        <a href="index.jsp" class="btn btn-primary btn-redirect">Go to Landing Page</a>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>

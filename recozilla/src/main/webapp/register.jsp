<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="con" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Registration Page">
    <meta name="author" content="Your Name">
    <title>Registration Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* General Styles */
        body {
            font-family: 'Arial', sans-serif;
            background: #f8f9fa;
            margin: 0;
            padding: 0;
        }

        .registration-container {
            max-width: 500px;
            margin: 50px auto;
            padding: 30px;
            background: white;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        .registration-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        .btn-custom {
            background-color: #007bff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            color: white;
            font-size: 16px;
            width: 100%;
        }

        .btn-custom:hover {
            background-color: #0056b3;
        }

        .form-label {
            font-weight: bold;
        }

        footer {
            text-align: center;
            margin-top: 50px;
            color: #6c757d;
        }
    </style>
</head>
<body>
    <!-- Registration Form Container -->
    <div class="registration-container">
        <h2>Register</h2>
        <form action="register" method="post">
            <!-- First Name -->
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter your first name" required>
            </div>
              <!-- Last Name -->
                        <div class="mb-3">
                            <label for="lastName" class="form-label">Last Name</label>
                            <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Enter your last name" required>
                        </div>
            <!-- Phone Num -->
            <div class="mb-3">
                <label for="phoneNum" class="form-label">Phone Num</label>
                <input type="text" class="form-control" id="phoneNum" name="phoneNum" placeholder="Enter your Phone Num" required>
            </div>
            <!-- Age  -->
            <div class="mb-3">
                <label for="age" class="form-label">Age</label>
                <input type="age" class="form-control" id="age" name="age" placeholder="Enter your age" required>
            </div>
            <!-- City -->
            <div class="mb-3">
                <label for="city" class="form-label">City</label>
                <input type="text" class="form-control" id="city" name="city" placeholder="Enter the City" required>
            </div>
            <!-- Gender -->
            <div class="mb-3">
                <label class="form-label">Gender</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" id="MALE" name="gender" value="MALE" required>
                    <label class="form-check-label" for="MALE">Male</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" id="FEMALE" name="gender" value="FEMALE" required>
                    <label class="form-check-label" for="FEMALE">Female</label>
                </div>
            </div>
              <!-- Pin code  -->
                       <div class="mb-3">
                           <label for="pinCode" class="form-label">pinCode</label>
                           <input type="text" class="form-control" id="pinCode" name="pinCode" placeholder="Enter the pinCode" required>
                       </div>
            </div>
            <!-- Submit Button -->
            <button type="submit" class="btn btn-custom">Register</button>
        </form>
    </div>

    <!-- Footer -->
    <footer>
        <p>&copy; 2024 Your Company. All Rights Reserved.</p>
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

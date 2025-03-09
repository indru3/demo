<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="High-quality landing page with responsive design">
    <meta name="author" content="Your Name">
    <title>Recozilla Dino</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* General Styles */
        body {
            font-family: 'Arial', sans-serif;
            line-height: 1.6;
        }

        /* Hero Section */
        header {
            background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%, rgba(9, 121, 117, 1) 35%, rgba(0, 212, 255, 1) 100%);
            color: white;
        }

        header h1 {
            font-size: 3rem;
            font-weight: bold;
        }

        header p {
            font-size: 1.25rem;
        }

        header .btn {
            background-color: #ff9800;
            border: none;
            padding: 0.8rem 1.5rem;
        }
        .header_container{
        margin-top: 109px;
        padding-top: 100px;
        margin-bottom: 100px;
        }


        /* Footer */
        footer {
            background-color: #222;

            color: #aaa;

        }
        .footer_container{
        margin-top: 10px;
        padding-top: 10px;
        }

    </style>
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Recozilla Dino</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#features">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#about">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#contact">Edit</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Hero Section -->
    <header class="bg-primary text-white text-center py-5">
        <div class="header_container">
            <h1>Welcome to Recozilla Dino </h1>
            <p class="lead">Ask or answer a Question and earn exciting Gifts </p>
            <a href="register.jsp" class="btn btn-light btn-lg">Register</a>
        </div>
    </header>



    <!-- Footer -->
    <footer class="bg-dark text-white text-center py-4">
        <div class="footer_container">
            <p>&copy; 2024 Recozilla. All Rights Reserved.</p>
        </div>
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>


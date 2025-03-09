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
            background: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6EAjicTNocuYLkem1aq8fmwOPM2ZRr4HyDg&s') no-repeat center center fixed; /* Background image */
            background-size: cover; /* Ensure the image covers the entire screen */
            background-position: center center; /* Keep the image centered */
            background-attachment: fixed; /* Keeps the background fixed while scrolling */
            color: white; /* Text color changed to white for contrast */
        }

        header {
            background: grey; /* Semi-transparent black background to blend with the image */
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
            color: black;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        header nav a:hover {
            background-color: rgba(255, 255, 255, 0.2); /* Light hover effect */
        }

        footer {
            background: rgba(0, 0, 0, 0.6); /* Semi-transparent footer */
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
            position: relative;
            z-index: 1;
            padding: 20px;
        }

        /* Responsive design for smaller screens */
        @media (max-width: 768px) {
            header nav {
                flex-direction: column;
                align-items: center;
            }

            header nav a {
                padding: 8px 15px;
            }
        }
    </style>
</head>
<body>

    <header>
        <h1>Welcome to New Year Party</h1>
        <nav>
            <a href="#home">Home</a>
            <a href="#about">About Us</a>
            <a href="signUp.jsp">Sign Up</a>
            <a href="signIn.jsp">Sign In</a>
        </nav>
    </header>

    <div class="content">
        Unlock your potential with our interactive learning app, where personalized courses and engaging content help you master new skills at your own pace.
    </div>

    <footer>
        <p>© 2025 My Website</p>
    </footer>

</body>
</html>

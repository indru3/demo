<%@ page language="java" contentType="text/html;charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            height: 100vh;
        }

        header {
            background-color: #4CAF50;
            color: white;
            padding: 8px;
            text-align: center;
        }

        header nav {
            display: flex;
            justify-content: right;
            gap: 16px;
        }

        header nav a {
            color: white;
            text-decoration: none;
            padding: 8px 16px;
            border-radius: 4px;
            transition: background-color 0.3s ease;
        }

        header nav a:hover {
            background-color: #45a049;
        }

        footer {
            background-color: #4CAF50;
            color: white;
            text-align: center;
            padding: 8px;
            position: relative;
            bottom: 0;
            width: 100%;
        }

        .form-container {
            background-color: #fff;
            max-width: 800px;
            margin: auto;
            padding: 16px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            flex: 1;
        }

        h2 {
            text-align: center;
            margin-bottom: 16px;
        }

        label {
            font-weight: bold;
            display: block;
            margin-top: 4px;
        }

        input[type="text"], input[type="email"], input[type="date"], input[type="number"], input[type="password"], select {
            width: 100%;
            padding: 8px;
            margin-top: 4px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        .form-group {
            margin-bottom: 12px;
        }

        /* Flexbox layout for input-group */
        .input-group {
            display: flex;
            gap: 16px;   /* Spacing between inputs */
            flex-wrap: wrap;  /* Allow wrapping on small screens */
        }

        .input-group .form-group {
            flex: 1 1 calc(50% - 16px);  /* Take up 50% width with gap */
            box-sizing: border-box;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 8px 16px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            margin-top: 16px;
        }

        button[type="reset"] {
            background-color: #f44336;
        }

        button:hover {
            opacity: 0.8;
        }

        .form-footer {
            display: flex;
            justify-content: space-between;
            margin-top: 16px;
        }

        .form-footer button {
            width: 48%;
        }

        /* Responsive design */
        @media (max-width: 768px) {
            .input-group .form-group {
                flex: 1 1 100%; /* Stack on small screens */
            }
        }
    </style>
</head>
<body>

    <!-- Header -->
    <header>
        <h1>Welcome to My Website</h1>
        <nav>
            <a href="#home">Home</a>
            <a href="#about">About Us</a>
            <a href="signUp.jsp">Sign Up</a>
            <a href="signIn.jsp">Sign In</a>
        </nav>
    </header>

    <!-- Form Container -->
    <div class="form-container">
        <h2>Registration Form</h2>
        <form id="registrationForm" action="register" method="POST" onsubmit="return validatePassword()">

            <!-- First Name and Last Name side by side -->
            <div class="input-group">
                <div class="form-group">
                <span>${firstNameError}</span>
                    <label for="firstName">First Name:</label>
                    <input type="text" id="firstName" name="firstName" required>
                </div>
                <div class="form-group">
                    <label for="lastName">Last Name:</label>
                    <input type="text" id="lastName" name="lastName" required>
                </div>
            </div>

            <!-- Email and Alternate Email side by side -->
            <div class="input-group">
                <div class="form-group">
                <div>${error}</div>
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" required>
                </div>
                <div class="form-group">
                    <label for="alternateEmail">Alternate Email:</label>
                    <input type="email" id="alternateEmail" name="alternateEmail">
                </div>
            </div>

            <!-- Contact Number and Alternate Contact side by side -->
            <div class="input-group">
                <div class="form-group">
                    <label for="contact">Contact Number:</label>
                    <input type="number" id="contact" name="contact" required>
                </div>
                <div class="form-group">
                    <label for="alternateContact">Alternate Number:</label>
                    <input type="number" id="alternateContact" name="alternateContact">
                </div>
            </div>

            <!-- Date of Birth and Place side by side -->
            <div class="input-group">
                <div class="form-group">
                    <label for="dateOfBirth">Date of Birth:</label>
                    <input type="date" id="dateOfBirth" name="dateOfBirth" required>
                </div>
                <div class="form-group">
                    <label for="place">Place:</label>
                    <input type="text" id="place" name="place" required>
                </div>
            </div>

            <!-- State and District side by side -->
            <div class="input-group">
                <div class="form-group">
                    <label for="state">State:</label>
                    <select id="state" name="state" onchange="updateDistricts()" required>
                        <option value="">Select a state</option>
                        <option value="Karnataka">Karnataka</option>
                        <option value="Goa">Goa</option>
                        <option value="Tamil Nadu">Tamil Nadu</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="district">District:</label>
                    <select id="district" name="district" required>
                        <option value="">Select a district</option>
                    </select>
                </div>
            </div>

            <!-- Password and Confirm Password side by side -->
            <div class="input-group">
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required>
                </div>
                <div class="form-group">
                    <label for="confirmPassword">Confirm Password:</label>
                    <input type="password" id="confirmPassword" name="confirmPassword" required>
                </div>
            </div>

            <div class="form-footer">
                <button type="submit">Submit</button>
                <button type="reset">Reset</button>
            </div>
        </form>
    </div>

    <!-- Footer -->
    <footer>
        <p>© 2025 My Website</p>
    </footer>

    <script>
        // Function to validate password and confirm password fields
        function validatePassword() {
            const password = document.getElementById('password').value;
            const confirmPassword = document.getElementById('confirmPassword').value;

            if (password !== confirmPassword) {
                alert("Passwords do not match!");
                return false; // Prevent form submission if passwords don't match
            }
            return true; // Allow form submission if passwords match
        }

        // Function to update the district options based on selected state
        function updateDistricts() {
            const state = document.getElementById('state').value;
            const districtSelect = document.getElementById('district');

            // Clear existing district options
            districtSelect.innerHTML = '<option value="">Select a district</option>';

            let districts = [];

            // Populate districts based on selected state
            if (state === 'Karnataka') {
                districts = ['Bangalore', 'Mysore', 'Hubli', 'Mangalore', 'Belagavi', 'Udupi', 'Chitradurga', 'Shivamogga', 'Dakshina Kannada'];
            } else if (state === 'Goa') {
                districts = ['North Goa', 'South Goa'];
            } else if (state === 'Tamil Nadu') {
                districts = ['Chennai', 'Coimbatore', 'Madurai', 'Salem'];
            }

            // Add the districts to the dropdown dynamically
            districts.forEach(district => {
                const option = document.createElement('option');
                option.value = district;
                option.textContent = district;
                districtSelect.appendChild(option);
            });
        }
    </script>

</body>
</html>

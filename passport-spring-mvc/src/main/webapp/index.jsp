<html>
<head>

    <title>Passport Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            background: #fff;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }
        input, select, textarea {
            margin-bottom: 15px;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ccc;
            border-radius: 4px;
            width: 100%;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<a href = "getAllUsers">GetAllUsers</a>

<div class="container">
    <h1>Passport Application Form</h1>

    <form action="passportDetails" method="post">

        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" >

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" >

        <label for="phoneNumber">Phone Number:</label>
        <input type="number" id="phoneNumber" name="phoneNumber" >

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" >

        <label for="address">Address:</label>
        <textarea id="address" name="address" ></textarea>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" >

        <label for="country">Country:</label>
        <input type="text" id="country" name="country" >

        <input type="submit" value = "Submit">
    </form>
</div>

</body>
</html>

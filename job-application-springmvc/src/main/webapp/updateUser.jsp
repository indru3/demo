<%@ page language =  "java" contentType = "text/html; charset = US-ASCII"
pageEncoding = "US-ASCII" %>
<%@ page isELIgnored = "false" %>


<html>
<head>
    <title>Edit</title>
    <style>
        body {
            background-color: #87CEEB;
            padding: 80px;
            margin-bottom: 40px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background-color: #FFFAF0;
            padding: 20px 40px;
            border-radius: 8px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: left;
        }

        h1 {
            font-size: 24px;
            color: #333;
            margin-bottom: 20px;
            text-align: center;
        }

        label {
            display: block;
            font-size: 14px;
            color: black;
            margin-bottom: 7px;
            text-align: left;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
            box-sizing: border-box;
        }

        input[type="text"]:focus {
            border-color: #007BFF;
            outline: none;
            box-shadow: 0px 0px 5px rgba(0, 123, 255, 0.5);
        }

        button {
            width: 100%;
            padding: 12px;
            background: #007BFF;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<h3>${updated}</h3>

<div class="form-container">
    <h1>Edit Job Application</h1>

    <form action="updateUser" method="post">

        <label for="input1">ID:</label>
        <input type="text" id="input1" name="id" value="${update.getId()}" readonly>

        <label for="input2">First Name:</label>
        <input type="text" id="input2" name="firstName" value="${update.getFirstName()}">

        <label for="input3">Last Name:</label>
        <input type="text" id="input3" name="lastName" value="${update.getLastName()}">

        <label for="input4">Phone Number:</label>
        <input type="text" id="input4" name="phone" value="${update.getPhone()}">

        <label for="input5">City:</label>
        <input type="text" id="input5" name="city" value="${update.getCity()}">

        <label for="input6">Email:</label>
        <input type="text" id="input6" name="email" value="${update.getEmail()}">

        <button type="submit">Update</button>
    </form>
</div>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>

<html>
<head>
    <title>Get All Job Applications</title>
    <style>
        table {
            font-family: Arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        .button {
            padding: 8px 16px;
            font-size: 1rem;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        /* Delete button styling */
        .delete-button {
            background-color: #f44336;
            color: white;
        }

        .delete-button:hover {
            background-color: #d32f2f;
        }

        /* Edit button styling */
        .edit-button {
            background-color: #4CAF50;
            color: white;
        }

        .edit-button:hover {
            background-color: #388e3c;
        }
    </style>
</head>
<body>

<h1>Job Applications</h1>

<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Phone Number</th>
        <th>City</th>
        <th>Email</th>
        <th>Action</th>
    </tr>

    <s:forEach var="job" items="${ListOfJobs}">
        <tr>
            <td>${job.getId()}</td>
            <td>${job.getFirstName()}</td>
            <td>${job.getLastName()}</td>
            <td>${job.getPhone()}</td>
            <td>${job.getCity()}</td>
            <td>${job.getEmail()}</td>
            <td>
                <button type = "delete"><a href="deleteJob?id=${job.getId()}">Delete</a></button>
                &nbsp <button type = "edit"> <a href="fetchJob?id=${job.getId()}" >Edit</a></button>
            </td>
        </tr>
    </s:forEach>
</table>

</body>
</html>

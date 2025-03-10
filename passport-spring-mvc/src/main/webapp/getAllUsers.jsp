<%@ page language ="java" contentType = "text\html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored ="false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="s" %>

<html>
<head>
<title>GetAllUsers</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
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

<table>
  <tr>
    <th>ID</th>
    <th>First name </th>
    <th>Last name </th>
    <th>Phone Number </th>
    <th>Age</th>
    <th>Email</th>
    <th>Address</th>
    <th>Country</th>
    <th>Action</th>

  </tr>

  <s:forEach var = "dtos" items = "${ ListOfUsers }" >
   <tr>
      <td>${dtos.getId()}</td>
      <td>${dtos.getFirstName()}</td>
      <td>${dtos.getLastName()}</td>
      <td>${dtos.getPhoneNumber()}</td>
      <td>${dtos.getAge()}</td>
      <td>${dtos.getEmail()}</td>
      <td>${dtos.getAddress()}</td>
      <td>${dtos.getCountry()}</td>

      <td><button type = "delete" ><a href = "delete?id=${dtos.getId()}" >Delete</a></button>
          &nbsp <button type = "edit" > <a href = "fetchUser?id=${dtos.getId()}">Edit</a></button>
      </td>
    </tr>
   </s:forEach>
</table>
</body>
</html>
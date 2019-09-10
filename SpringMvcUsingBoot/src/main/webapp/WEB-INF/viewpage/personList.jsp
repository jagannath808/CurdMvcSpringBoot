<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Person List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Student List</h1>

<center>
    <div>
      <table border="1">
        <tr>
          <th>Id</th>
          <th>Name</th>
          <th>Email</th>
          <th>Domain</th>
           <th>Option</th>
        </tr>
        <c:forEach  items="${student}" var ="student">
        <tr>
          <td>${student.id}</td>
          <td>${student.name}</td>
          <td>${student.email}</td>
          <td>${student.domain}</td>
          <td> <a href="/getStudentById/${student.id}">Edit</a>
          	<a href="/deleteStudent/${student.id}">Delete</a>
          </td> 
        </tr>
        </c:forEach>
      </table>
      
    </div>
    </center>
    Click to back <a href="/index">here</a>
  </body>
  
</html>
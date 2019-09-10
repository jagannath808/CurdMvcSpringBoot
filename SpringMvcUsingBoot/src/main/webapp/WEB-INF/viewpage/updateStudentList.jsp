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
    <form modelAttribute="student">
      <table border="1">
        <tr>
        <th>ID</th>
          <th>Name</th>
          <th>Email</th>
          <th>Domain</th>
           <th>Option</th>
        </tr>
        <c:forEach  items="${student}" var ="student">
        <tr>
          <td>
          	<input type="hidden" name="id" value=${student.id}>
          </td>
          <td>
          	<input type="text" name="name" value=${student.name}>
          </td>
          <td>
          	<input type="text" name="email" value=${student.email}>
          </td>
          <td>
          	<input type="text" name="domain" value=${student.domain}>
          </td>
         
          <!-- <td> <a href="/updateAndSave">Save</a>
          	<a href="#">Cancel</a>
          </td>  -->
          <td><input type="submit" formaction="/updateAndSave" value="Save">
          		<input type="submit" formaction="/studentList" value="Cancel"> 
          		
          </td> 
        </tr>
        </c:forEach>
      </table>
      </form>
    </div>
    </center>
    Click to back <a href="/index">here</a>
  </body>
  
</html>
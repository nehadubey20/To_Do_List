<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todo Form</title>


<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
 
<style>
	.card-body {
    -ms-flex: 1 1 auto;
    flex: 0 1 auto;
    padding: 9.25rem;
    }
</style>


</head>
<body>
 <header>

   <ul class="navbar-nav">
    <li><a href="<%-- <%=request.getContextPath()%> --%>/list"
     class="nav-link">Todos</a></li>
   </ul>

   <ul class="navbar-nav navbar-collapse justify-content-end">
    <li><a href="<%-- <%=request.getContextPath()%> --%>/logout"
     class="nav-link">Logout</a></li>
   </ul>
 </header>
 
 -->
 
  <jsp:include page="header.jsp"></jsp:include>
 
 <div class="container col-md-5">
  <div class="card">
   <div class="card-body">
    <fieldset class="form-group">
     <label>Todo Title</label> <input type="text"
      value="" class="form-control"
      name="title" required="required" minlength="5">
    </fieldset>

    <fieldset class="form-group">
     <label>Todo Decription</label> <input type="text"
      value="<c:out value='${todo.description}' />" class="form-control"
      name="description" minlength="5">
    </fieldset>

    <fieldset class="form-group">
     <label>Todo Status</label> <select class="form-control"
      name="isDone">
      <option value="false">In Progress</option>
      <option value="true">Complete</option>
     </select>
    </fieldset>

    <fieldset class="form-group">
     <label>Todo Target Date</label> <input type="date"
      value="<c:out value='${todo.targetDate}' />" class="form-control"
      name="targetDate" required="required">
    </fieldset>
    <button type="submit" class="btn btn-success">Save</button>
    </form>
   </div>
  </div>
 </div>

 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
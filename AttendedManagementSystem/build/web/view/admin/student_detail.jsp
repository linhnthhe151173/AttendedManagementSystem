<%-- 
    Document   : student_detail
    Created on : Dec 10, 2021, 3:03:21 PM
    Author     : Linh
--%>

<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>student_detail</title>
        <%
            ArrayList<Student> list = (ArrayList<Student>)request.getAttribute("list");
        %>
    </head>
    <body>
        <!-- header -->
        <nav class="navbar navbar-expand-md sticky-top" style="background-color: #EF7F1B;">
            <a class="navbar-brand" href="home" style="color: white;">Attendence Management</a>
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navb" aria-expanded="true">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div id="navb" class="navbar-collapse collapse hide">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="home_admin.jsp" style="color: white;"><span class="fas fa-user">Welcome: </span>${sessionScope.account.getDisplayName()}</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" style="color: white;"><span class="fas fa-sign-in-alt"></span>| Logout</a>
                    </li>
                </ul>
            </div>
        </nav>
        
        <div class="container-fluid">
            <!-- Search form -->
            <div style="display: flex;margin-top: 20px;">
                <input class="form-control" type="text" placeholder="Search" aria-label="Search">
                <input type="submit" style="background-color: #EF7F1B;
                       border: none;" value="Search">
            </div>
            <h4 style="text-align: center;
                margin-top: 20px;
                font-weight: bold;
                color: #EF7F1B;">STUDENT DETAIL</h4>
            <hr>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th scope="col">STT</th>
                        <th scope="col">Student Code</th>
                        <th scope="col">Student Name</th>
                        <th scope="col">Image</th>
                        <th scope="col">Gender</th>
                        <th scope="col">Address</th>
                        <th scope="col">Email</th>
                        <th scope="col">Phone</th>
                        <th scope="col">Date of birth</th>
                        <th scope="col">Semester</th>
                        <th scope="col">Edit</th>
                        <th scope="col">Remove</th>
                    </tr>

                </thead>
                <tbody>
                    <%
                        for (int i = 0; i < list.size(); i++) {
                                %>
                                <tr>
                            <td><%=i+1%></td>
                            <td><%=list.get(i).getStudentID() %></td>
                            <td><%=list.get(i).getStudentName()%></td>
                            <td><img src="../img/<%=list.get(i).getStudentImage()%>" style="width: 100px;height: 100px;"></td>
                            <td><%=list.get(i).isStudentGender() == true?"Male":"Female" %></td>
                            <td><%=list.get(i).getStudentAddress()%></td>
                            <td><%=list.get(i).getStudentEmail()%></td>
                            <td><%=list.get(i).getStudentPhone()%></td>
                            <td><%=list.get(i).getStudentDOB()%></td>
                            <td><%=list.get(i).getSemesterID().getSemesterName() %></td>
                            <td><a href="../student/edit?studentID=<%=list.get(i).getStudentID() %>">Edit</a></td>
                            <td><a href="../student/remove?studentID=<%=list.get(i).getStudentID() %>">Remove</a></td>
                        </tr>
                                <%
                            }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>

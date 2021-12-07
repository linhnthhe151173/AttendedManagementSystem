<%-- 
    Document   : other_schedule
    Created on : Dec 7, 2021, 12:04:27 PM
    Author     : Linh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>other_schedule</title>
    </head>
    <body>
        <!-- header -->
        <nav class="navbar navbar-expand-md sticky-top" style="background-color: #EF7F1B;">
            <a class="navbar-brand" href="#" style="color: white;">Attendence Management</a>
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navb" aria-expanded="true">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div id="navb" class="navbar-collapse collapse hide">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="#" style="color: white;"><span class="fas fa-user"></span>LinhNTHHE151173</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" style="color: white;"><span class="fas fa-sign-in-alt"></span>| Logout</a>
                    </li>
                </ul>
            </div>
        </nav>
        
        <!-- Container -->
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <h6 style="margin-top: 20px;">Find attendance 's schedule </h6>
                    <form style="display: flex;">
                        <input type="date" name="" value="" style="border-radius: 5px;"/>
                        <button type="button" class="btn" style="background-color: #EF7F1B;">Search</button>
                    </form>
                </div>
                <div class="col-md-9" style="margin-top: 20px;">
                    <div style="margin-bottom: 40px;">
                        <div style="text-align: center;">
                            <h5 style="color: #EF7F1B;">Date: 02-08-2021</h5> 
                        </div>
                        <div>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th scope="col">STT</th>
                                        <th scope="col">Teacher's Name</th>
                                        <th scope="col">Subject's Code</th>
                                        <th scope="col">Subject's Name</th>
                                        <th scope="col">Class's Name</th>
                                        <th scope="col">Number</th>
                                        <th scope="col">Time Slot</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">1</th>
                                        <td>Nguyen Hai Linh</td>
                                        <td>PRJ301</td>
                                        <td>Java Web Application</td>
                                        <td><a href="class_detail.jsp">SE1511</a></td>
                                        <td>30</td>
                                        <td>7:30-9:30</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">2</th>
                                        <td>Nguyen Hai Linh</td>
                                        <td>PRJ301</td>
                                        <td>Java Web Application</td>
                                        <td><a href="class_detail.jsp">SE1511</a></td>
                                        <td>30</td>
                                        <td>7:30-9:30</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">3</th>
                                        <td>Nguyen Hai Linh</td>
                                        <td>PRJ301</td>
                                        <td>Java Web Application</td>
                                        <td><a href="class_detail.jsp">SE1511</a></td>
                                        <td>30</td>
                                        <td>7:30-9:30</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    
                    <!--time 2-->
                    <div>
                        <div style="text-align: center;">
                            <h5 style="color: #EF7F1B;">Date: 02-08-2021</h5> 
                        </div>
                        <div class="alert alert-warning" role="alert">
                            No schedule yet
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

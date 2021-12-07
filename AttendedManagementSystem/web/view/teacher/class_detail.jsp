<%-- 
    Document   : class_detail
    Created on : Dec 7, 2021, 12:16:51 PM
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
        <title>class_detail</title>
    </head>
    <body>
        <!-- header -->
        <nav class="navbar navbar-expand-md sticky-top" style="background-color: #EF7F1B;margin-bottom: 20px;">
            <a class="navbar-brand" href="today_schedule.jsp" style="color: white;">Attendence Management</a>
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
            <div>
                <button type="button" class="btn" style="background-color: #EF7F1B;"><a href="other_schedule.jsp" style="color: white;
                                                                                        text-decoration: none;">Back</a></button>
            </div>
            <div style="padding-top: 10px;">
                <h4 style="text-align: center;">Class name: <span style="color: #EF7F1B;">SE1511</span></h4>   
            </div>
            <div style="margin-top: 20px;">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">STT</th>
                            <th scope="col">Image</th>
                             <th scope="col">Student Code</th>
                            <th scope="col">Email</th>
                            <th scope="col">Full Name</th>
                            <th scope="col">Date Of Birth</th>
                            <th scope="col">Gender</th>
                            <th scope="col">Address</th>
                            <th scope="col">Phone</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">1</th>
                            <td><img src="../../img/avatar.png" style="width: 100px;height: 100px;"></td>
                            <td>HE151173</td>
                            <td>LinhNTHHE151173@fpt.edu.vn</td>
                            <td>Nguyễn Thị Hải Linh</td>
                            <td>02-08-2001</td>                            
                            <td>Female</td>
                            <td>Hai Duong</td>
                            <td>12345</td>
                        </tr>
                        <tr>
                            <th scope="row">2</th>
                            <td><img src="../../img/avatar.png" style="width: 100px;height: 100px;"></td>
                            <td>HE151173</td>
                            <td>LinhNTHHE151173@fpt.edu.vn</td>
                            <td>Nguyễn Thị Hải Linh</td>
                            <td>02-08-2001</td>                            
                            <td>Female</td>
                            <td>Hai Duong</td>
                            <td>12345</td>
                        </tr>
                        <tr>
                            <th scope="row">3</th>
                            <td><img src="../../img/avatar.png" style="width: 100px;height: 100px;"></td>
                            <td>HE151173</td>
                            <td>LinhNTHHE151173@fpt.edu.vn</td>
                            <td>Nguyễn Thị Hải Linh</td>
                            <td>02-08-2001</td>                            
                            <td>Female</td>
                            <td>Hai Duong</td>
                            <td>12345</td>
                        </tr>
                        <tr>
                            <th scope="row">4</th>
                            <td><img src="../../img/avatar.png" style="width: 100px;height: 100px;"></td>
                            <td>HE151173</td>
                            <td>LinhNTHHE151173@fpt.edu.vn</td>
                            <td>Nguyễn Thị Hải Linh</td>
                            <td>02-08-2001</td>                            
                            <td>Female</td>
                            <td>Hai Duong</td>
                            <td>12345</td>
                        </tr>
                        <tr>
                            <th scope="row">5</th>
                            <td><img src="../../img/avatar.png" style="width: 100px;height: 100px;"></td>
                            <td>HE151173</td>
                            <td>LinhNTHHE151173@fpt.edu.vn</td>
                            <td>Nguyễn Thị Hải Linh</td>
                            <td>02-08-2001</td>                            
                            <td>Female</td>
                            <td>Hai Duong</td>
                            <td>12345</td>
                        </tr>
                        <tr>
                            <th scope="row">6</th>
                            <td><img src="../../img/avatar.png" style="width: 100px;height: 100px;"></td>
                            <td>HE151173</td>
                            <td>LinhNTHHE151173@fpt.edu.vn</td>
                            <td>Nguyễn Thị Hải Linh</td>
                            <td>02-08-2001</td>                            
                            <td>Female</td>
                            <td>Hai Duong</td>
                            <td>12345</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>

        
        <!-- Footer -->
            <footer class="page-footer font-small blue" style="margin-top: 10px;">

                <!-- Copyright -->
                <div class="footer-copyright text-center py-3">© Powered by <span style="color: #EF7F1B;">Linhnthhe151173</span>
                </div>
                <!-- Copyright -->

            </footer>
            <!-- Footer -->
    </body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>

</head>
<body>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            New Student Information
            <small>Preview</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Forms</a></li>
            <li class="active">General Elements</li>
        </ol>
    </section>

    <!-- Main content -->
    <section class="content">
        <!-- form start -->
        <form:form role="form" commandName="student" method="post" action="insert-student">

            <div class="row">
                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div class="box box-primary">
                        <div class="box-header">
                            <h3 class="box-title">Personal Information</h3>
                        </div>
                        <!-- /.box-header -->

                        <div class="box-body">

                            <div class="form-group">
                                <label for="studentName">Student Name</label>
                                <form:input type="email" class="form-control" id="studentName" placeholder="Enter Name"
                                            path="studentName"/>
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label>
                                <input type="password" class="form-control" id="exampleInputPassword1"
                                       placeholder="Password">
                            </div>

                            <!-- select -->
                            <div class="form-group">
                                <label for="gender">Gender</label>
                                <select id="gender" class="form-control">
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                </select>
                            </div>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
                <!--/.col (left) -->

                <!-- right column -->
                <div class="col-md-6">
                    <!-- general form elements disabled -->
                    <div class="box box-warning">
                        <div class="box-header">
                            <h3 class="box-title">Contact Info</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <!-- text input -->

                            <div class="form-group">
                                <label>Email Address</label>
                                <input type="text" class="form-control" placeholder="Enter Email"/>
                            </div>

                            <div class="form-group">
                                <label>Phone Number</label>
                                <input type="text" class="form-control" placeholder="Enter Phone Number"/>
                            </div>

                            <!-- textarea -->
                            <div class="form-group">
                                <label>Address</label>
                                <textarea class="form-control" rows="3" placeholder="Enter Address"></textarea>
                            </div>

                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
                <!--/.col (right) -->
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-md-12">
                    <div class="box box-default">
                        <div class="box-body">
                            <div class="box-footer">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </form:form>
    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>View Student</title>
</head>
<body>
<jsp:useBean id="genderBean" class="org.madrona.common.bean.GenderBean"/>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Student Information
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
                                <form:input type="text" class="form-control" id="studentName"
                                            placeholder="Enter Student Name"
                                            path="studentName"/>
                            </div>

                            <div class="form-group">
                                <label for="grade">Grade</label>
                                <form:input type="text" class="form-control" id="grade"
                                       placeholder="Enter Grade" path="grade.name"/>
                            </div>

                            <!-- select -->
                            <div class="form-group">
                                <label for="gender">Gender</label>
                                <form:select id="gender" class="form-control" path="gender">
                                    <c:forEach items="${genderBean.values}" var="state">
                                        <form:option value="${state}">${state}</form:option>
                                    </c:forEach>
                                </form:select>
                            </div>

                            <!-- Date dd/mm/yyyy -->
                            <div class="form-group">
                                <label>Date of Birth</label>
                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-calendar"></i>
                                    </div>
                                    <form:input type="text" class="form-control" data-inputmask="'alias': 'dd/mm/yyyy'" path="dateOfBirth" data-mask="true"/>
                                </div><!-- /.input group -->
                            </div><!-- /.form group -->

                            <div class="form-group">

                                <img class="img-rounded img-thumbnail" width="200px" src="resources/profiles/${student.profilePicture}"/>
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
                                <form:input type="text" class="form-control" placeholder="Enter Email" path="emailAddress"/>
                            </div>

                            <div class="form-group">
                                <label>Phone Number</label>
                                <form:input type="text" class="form-control" placeholder="Enter Phone Number" path="mobileNumber"/>
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
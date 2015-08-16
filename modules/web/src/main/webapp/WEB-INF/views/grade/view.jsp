<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add New Class</title>
</head>
<body>
<jsp:useBean id="genderBean" class="org.madrona.common.bean.GenderBean"/>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            New Class Information
            <small>Preview</small>
        </h1>
        <div class="breadcrumb">
            <a href="view-all-grade" class="btn btn-block btn-success btn-flat">View All Classes</a>
        </div>
    </section>
    <br>

    <!-- Main content -->
    <section class="content">
        <!-- form start -->
        <form:form role="form" commandName="grade" method="post" action="insert-grade">

            <div class="row">
                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div class="box box-primary">
                        <div class="box-header">
                            <h3 class="box-title">Class Information</h3>
                        </div>
                        <!-- /.box-header -->

                        <div class="box-body">

                            <div class="form-group">
                                <label for="className">Class Name</label>
                                <form:input type="text" class="form-control" id="className"
                                            placeholder="Enter Student Name"
                                            path="name"/>
                            </div>

                            <div class="form-group">
                                <label for="grade">Class Teacher Name</label>
                                <form:input type="text" class="form-control" id="grade"
                                            placeholder="Enter Grade" path="teacher"/>
                            </div>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
                <!--/.col (left) -->
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">Student Full Data Table</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <table id="example1" class="table table-bordered table-striped">
                                <thead>
                                <tr>
                                    <th>Student Id</th>
                                    <th>Student Name</th>
                                    <th>Grade</th>
                                    <th>Email</th>
                                    <th>Phone</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${grade.students}" var="student">
                                    <tr>
                                        <td>${student.id}</td>
                                        <td><a href="view-student?id=${student.id}">${student.studentName}</a></td>
                                        <td>${student.grade.name}</td>
                                        <td>${student.emailAddress}</td>
                                        <td>${student.mobileNumber}</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                                <tfoot>
                                <tr>
                                    <th>Student Id</th>
                                    <th>Student Name</th>
                                    <th>Grade</th>
                                    <th>Email</th>
                                    <th>Phone</th>
                                </tr>
                                </tfoot>
                            </table>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
                <!-- /.col -->
            </div>


            <div class="row">
                <div class="col-md-12">
                    <div class="box box-default">
                        <div class="box-body">
                            <div class="box-footer">
                                <button type="submit" class="btn btn-primary">Submit</button> &nbsp;
                                <button type="reset" class="btn btn-default">Clear</button>
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
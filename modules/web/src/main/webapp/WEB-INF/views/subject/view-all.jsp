<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>View All Subject Details</title>
</head>
<body>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1> Subject Details Data Table
            <small>All Subject details</small>
        </h1>
        <div class="breadcrumb">
            <a href="add-student" class="btn btn-block btn-success btn-flat">Add New Subject</a>
        </div>

        <br>
        <c:if test="${param.success eq true}">
            <div class="alert alert-success alert-dismissable">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                <h4>	<i class="icon fa fa-check"></i> Success!</h4>
                The student details has been successfully saved in the system!.
            </div>
        </c:if>
        <c:if test="${param.error eq true}">
            <div class="alert alert-danger alert-dismissable">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                <h4>	<i class="icon fa fa-check"></i> Failed!</h4>
                Error occurred while inserting the student details into the system!
            </div>
        </c:if>

    </section>


    <!-- Main content -->
    <section class="content">
        <div class="row">
            <div class="col-xs-12">
                <div class="box">
                    <div class="box-header">
                        <h3 class="box-title">Subject Full Data Table</h3>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <table id="example1" class="table table-bordered table-striped">
                            <thead>
                            <tr>
                                <th>Subject Id</th>
                                <th>Subject Name</th>
                                <th>Grade</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${subjects}" var="subject">
                                <tr>
                                    <td>${subject.id}</td>
                                    <td><a href="view-subject?id=${subject.id}">${subject.name}</a></td>
                                    <td>${subject.grade.id}</td>
                                    <%--<td>${subject.contactNumber}</td>--%>
                                </tr>
                            </c:forEach>
                            </tbody>
                            <tfoot>
                            <tr>
                                <th>Subject Id</th>
                                <th>Subject Name</th>
                                <th>Grade</th>
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
        <!-- /.row -->
    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->
</body>
</html>
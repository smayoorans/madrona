<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Subject Details</title>
</head>
<body>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>Subject Information
            <small>Preview</small>
        </h1>
        <div class="breadcrumb">
            <a href="view-all-parent" class="btn btn-block btn-success btn-flat">View All Subject</a>
        </div>
    </section>
    <br>

    <!-- Main content -->
    <section class="content">
        <!-- form start -->
        <form:form role="form" commandName="subject" method="post" action="update-subject"
                   enctype="multipart/form-data">

            <div class="row">
                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div class="box box-primary">
                        <div class="box-header">
                            <h3 class="box-title">Subject Details</h3>
                        </div>
                        <!-- /.box-header -->

                        <div class="box-body">

                            <div class="form-group">
                                <form:input type="text" class="form-control" id="id" path="id" readonly="true"/>
                            </div>

                            <div class="form-group">
                                <label for="gradeId">Grade</label>
                                <form:select id="gradeId" name="gradeId" class="form-control" path="grade.id">
                                    <c:forEach items="${gradeList}" var="aGrade">
                                        <form:option value="${aGrade.id}">${aGrade.name}</form:option>
                                    </c:forEach>
                                </form:select>
                            </div>

                            <div class="form-group">
                                <label for="name">Subject Name</label>
                                <form:input type="text" class="form-control" id="name"
                                            placeholder="Enter Subject Name" path="name"/>
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
                            <h3 class="box-title">Subject Details</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <!-- text input -->





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
                                <button type="submit" class="btn btn-primary">Update</button>
                                &nbsp;
                                <button type="reset" class="btn btn-default">Clear</button>


                                <button type="button" class="btn btn-danger pull-right" data-toggle="modal"
                                        data-target="#myModal">Delete
                                </button>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form:form>
    </section>
    <!-- /.content -->

    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <form id="delete-form" method="post" action="delete-parent?id=${parent.id}">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Warning</h4>
                    </div>
                    <div class="modal-body">
                        Are you sure you want to delete the student details
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Yes</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>
<!-- /.content-wrapper -->
</body>
</html>
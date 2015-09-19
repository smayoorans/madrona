<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Parent Detials</title>
</head>
<body>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>Parent Information
            <small>Preview</small>
        </h1>
        <div class="breadcrumb">
            <a href="view-all-parent" class="btn btn-block btn-success btn-flat">View All Parent</a>
        </div>
    </section>
    <br>

    <!-- Main content -->
    <section class="content">
        <!-- form start -->
        <form:form role="form" commandName="parent" method="post" action="update-parent"
                   enctype="multipart/form-data">

            <div class="row">
                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div class="box box-primary">
                        <div class="box-header">
                            <h3 class="box-title">Father Details</h3>
                        </div>
                        <!-- /.box-header -->

                        <div class="box-body">

                            <div class="form-group">
                                <form:input type="text" class="form-control" id="id" path="id" readonly="true"/>
                            </div>

                            <div class="form-group">
                                <label for="fatherName">Father Name</label>
                                <form:input type="text" class="form-control" id="fatherName"
                                            placeholder="Enter Fathher Name" path="fatherName"/>
                            </div>


                            <div class="form-group">
                                <label for="fatherJob">Father Job</label>
                                <form:input type="text" class="form-control" id="fatherJob"
                                            placeholder="Enter Fathher Name" path="fatherJob"/>
                            </div>

                            <!-- Date dd/mm/yyyy -->
                            <div class="form-group">
                                <label>Father Date of Birth</label>

                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-calendar"></i>
                                    </div>
                                    <form:input type="text" class="form-control" data-inputmask="'alias': 'dd/mm/yyyy'"
                                                path="fatherDateOfBirth" data-mask="true"/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->

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
                            <h3 class="box-title">Mother Details</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <!-- text input -->

                            <div class="form-group">
                                <label for="motherName">Mother Name</label>
                                <form:input type="text" class="form-control" id="motherName"
                                            placeholder="Enter Mother Name" path="motherName"/>
                            </div>

                            <div class="form-group">
                                <label for="motherJob">Mother Job</label>
                                <form:input type="text" class="form-control" id="motherJob"
                                            placeholder="Enther Mother Job" path="motherJob"/>
                            </div>


                            <div class="form-group">
                                <label>Mother Date of Birth</label>

                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-calendar"></i>
                                    </div>
                                    <form:input type="text" class="form-control" data-inputmask="'alias': 'dd/mm/yyyy'"
                                                path="motherDateOfBirth" data-mask="true"/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->


                            <!-- phone mask -->
                            <div class="form-group">
                                <label>Contact Number</label>

                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-phone"></i>
                                    </div>
                                    <form:input type="text" class="form-control"
                                                data-inputmask='"mask": "(999) 999-9999"' data-mask="true"
                                                path="contactNumber"/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->


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
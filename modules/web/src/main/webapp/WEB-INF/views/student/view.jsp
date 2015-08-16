<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add New Student</title>
</head>
<body>
<jsp:useBean id="genderBean" class="org.madrona.common.bean.GenderBean"/>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>Student Information
            <small>Preview</small>
        </h1>
        <div class="breadcrumb">
            <a href="view-all-student" class="btn btn-block btn-success btn-flat">View All Student</a>
        </div>
    </section>
    <br>

    <!-- Main content -->
    <section class="content">
        <!-- form start -->
        <form:form role="form" commandName="student" method="post" action="update-student"
                   enctype="multipart/form-data">

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
                                <form:input type="text" class="form-control" id="id" path="id" readonly="true"/>
                            </div>

                            <div class="form-group">
                                <label for="studentName">Student Name</label>
                                <form:input type="text" class="form-control" id="studentName"
                                            placeholder="Enter Student Name"
                                            path="studentName"/>
                            </div>

                            <div class="form-group">
                                <label for="gradeId">Grade</label>
                                <select id="gradeId" name="gradeId" class="form-control">
                                    <option value="${student.grade.id}">${student.grade.name}</option>
                                    <c:forEach items="${gradeList}" var="aGrade">
                                        <option value="${aGrade.id}">${aGrade.name}</option>
                                    </c:forEach>
                                </select>
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
                                    <form:input type="text" class="form-control" data-inputmask="'alias': 'dd/mm/yyyy'"
                                                path="dateOfBirth" data-mask="true"/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->

                            <div class="form-group">
                                <label>Joining Date</label>

                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-calendar"></i>
                                    </div>
                                    <form:input type="text" class="form-control" data-inputmask="'alias': 'dd/mm/yyyy'"
                                                path="joinedDate" data-mask="true"/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->


                                <%--Profile Picture--%>
                            <div class="form-group">
                                <label for="profile_picture">Student Profile Picture</label>
                                <input id="profile_picture" type="file" name="profile_picture">
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
                                <form:input type="text" class="form-control" placeholder="Enter Email"
                                            path="emailAddress"/>
                            </div>


                            <!-- phone mask -->
                            <div class="form-group">
                                <label>Phone Number</label>

                                <div class="input-group">
                                    <div class="input-group-addon">
                                        <i class="fa fa-phone"></i>
                                    </div>
                                    <form:input type="text" class="form-control"
                                                data-inputmask='"mask": "(999) 999-9999"' data-mask="true"
                                                path="mobileNumber"/>
                                </div>
                                <!-- /.input group -->
                            </div>
                            <!-- /.form group -->

                            <form:input type="text" class="form-control" id="address-id" path="homeAddress.id"/>

                            <div class="form-group">
                                <label>House Number</label>
                                <form:input type="text" class="form-control" placeholder="Enter House Number"
                                            path="homeAddress.houseNumber"/>
                            </div>


                            <div class="form-group">
                                <label>Address Line 1</label>
                                <form:input type="text" class="form-control" placeholder="Enter Address Line 2"
                                            path="homeAddress.addressLine1"/>
                            </div>


                            <div class="form-group">
                                <label>Address Line 2</label>
                                <form:input type="text" class="form-control" placeholder="Enter Address Line 1"
                                            path="homeAddress.addressLine2"/>
                            </div>


                            <div class="form-group">
                                <label>District</label>
                                <form:input type="text" class="form-control" placeholder="Enter District"
                                            path="homeAddress.district"/>
                            </div>


                            <div class="form-group">
                                <label>Province</label>
                                <form:input type="text" class="form-control" placeholder="Enter Province"
                                            path="homeAddress.province"/>
                            </div>


                                <%--   <!-- textarea -->
                                    <div class="form-group">
                                        <label>Address</label>
                                        <textarea class="form-control" rows="3" placeholder="Enter Address"></textarea>
                                    </div>--%>

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
                <form id="delete-form" method="post" action="delete-student?id=${student.id}">
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
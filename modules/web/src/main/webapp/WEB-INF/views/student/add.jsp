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
        <h1>
            New Student Information
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
        <form:form role="form" commandName="student" method="post" action="add-student-action"
                   enctype="multipart/form-data">

            <div class="row">
                <div class="col-md-12">
                    <div class="nav-tabs-custom">
                        <!-- Tabs within a box -->
                        <ul class="nav nav-tabs pull-left">
                            <li class="active"><a href="#general-info" data-toggle="tab">GENERAL INFO</a></li>
                            <li><a href="#parent-info" data-toggle="tab">Parent Info</a></li>
                            <li><a href="#contact-info" data-toggle="tab">Contact Info</a></li>
                            <li><a href="#enrollment-info" data-toggle="tab">ENROLLMENT INFO</a></li>
                            <li><a href="#others" data-toggle="tab">OTHERS</a></li>
                        </ul>
                        <div class="tab-content no-padding">
                            <!--Personal info-->
                            <div class="chart tab-pane active" id="general-info" style="position: relative;">
                                <br/>

                                <div class="col-md-6">
                                    <!-- general form elements -->
                                    <div class="box box-primary">
                                        <div class="box-header">
                                            <h3 class="box-title">Personal Info</h3>
                                        </div>
                                        <!-- /.box-header -->

                                        <div class="box-body">

                                            <div class="form-group">
                                                <label for="name">Student Name</label>
                                                <form:input type="text" class="form-control" id="name"
                                                            placeholder="Enter Student Name" path="name"/>
                                            </div>

                                            <div class="form-group">
                                                <label for="gradeId">Grade</label>
                                                <select id="gradeId" name="gradeId" class="form-control">
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
                                                    <form:input type="text" class="form-control"
                                                                data-inputmask="'alias': 'dd/mm/yyyy'"
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
                                                    <form:input type="text" class="form-control"
                                                                data-inputmask="'alias': 'dd/mm/yyyy'"
                                                                path="joinedDate" data-mask="true"/>
                                                </div>
                                                <!-- /.input group -->
                                            </div>
                                            <!-- /.form group -->


                                        </div>
                                        <!-- /.box-body -->
                                    </div>
                                    <!-- /.box -->
                                </div>

                                <div class="col-md-6">
                                    <!-- general form elements disabled -->
                                    <div class="box box-warning">
                                        <div class="box-header">
                                            <h3 class="box-title">Profile Info</h3>
                                        </div>
                                        <!-- /.box-header -->
                                        <div class="box-body">

                                            <div class="form-group">
                                                <label for="profile_picture">Profile Picture</label>
                                                <input id="profile_picture" type="file" name="profile_picture">
                                            </div>

                                            <div class="form-group">
                                                <label for="primary-language">Primary Language</label>
                                                <select id="primary-language" class="form-control">
                                                    <c:forEach items="${genderBean.values}" var="language">
                                                        <option value="${language}">${language}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>

                                        </div>
                                        <!-- /.box-body -->
                                    </div>
                                    <!-- /.box -->
                                    <div class="box box-success">
                                        <div class="box-header">
                                            <h3 class="box-title">Account Info</h3>
                                        </div>
                                        <!-- /.box-header -->
                                        <div class="box-body">

                                            <div class="form-group required">
                                                <label for="name" class="control-label">Username</label>
                                                <form:input type="text" class="form-control" id="name"
                                                            placeholder="Enter Username" path="userAccess.username"/>
                                            </div>

                                            <div class="form-group required">
                                                <label for="name" class="control-label">Password</label>
                                                <form:input type="text" class="form-control" id="name"
                                                            placeholder="Enter Password"
                                                            path="userAccess.password"/>
                                            </div>

                                        </div>
                                        <!-- /.box-body -->
                                    </div>
                                </div>
<%--                                <div class="col-lg-12">
                                    <a href="#contact-info" class="btn btn-primary col-sm-1" data-toggle="tab">Next</a>
                                    <br>
                                    <br>
                                    <br>
                                </div>--%>


                            </div>

                            <div class="chart tab-pane" id="parent-info" style="position: relative;">
                                <br>
                                <div class="col-md-6">
                                    <!-- general form elements -->
                                    <div class="box box-primary">
                                        <div class="box-header">
                                            <h3 class="box-title">Father Details</h3>
                                        </div>
                                        <!-- /.box-header -->

                                        <div class="box-body">

                                            <div class="form-group">
                                                <label for="fatherName">Father Name</label>
                                                <form:input type="text" class="form-control" id="fatherName"
                                                            placeholder="Enter Fathher Name" path="parent.fatherName"/>
                                            </div>


                                            <div class="form-group">
                                                <label for="fatherJob">Father Job</label>
                                                <form:input type="text" class="form-control" id="fatherJob"
                                                            placeholder="Enter Fathher Name" path="parent.fatherJob"/>
                                            </div>

                                            <!-- Date dd/mm/yyyy -->
                                            <div class="form-group">
                                                <label>Father Date of Birth</label>

                                                <div class="input-group">
                                                    <div class="input-group-addon">
                                                        <i class="fa fa-calendar"></i>
                                                    </div>
                                                    <form:input type="text" class="form-control" data-inputmask="'alias': 'dd/mm/yyyy'"
                                                                path="parent.fatherDateOfBirth" data-mask="true"/>
                                                </div>
                                                <!-- /.input group -->
                                            </div>
                                            <!-- /.form group -->


                                        </div>
                                        <!-- /.box-body -->
                                    </div>
                                    <!-- /.box -->
                                </div>

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
                                                            placeholder="Enter Mother Name" path="parent.motherName"/>
                                            </div>

                                            <div class="form-group">
                                                <label for="motherJob">Mother Job</label>
                                                <form:input type="text" class="form-control" id="motherJob"
                                                            placeholder="Enther Mother Job" path="parent.motherJob"/>
                                            </div>


                                            <div class="form-group">
                                                <label>Mother Date of Birth</label>

                                                <div class="input-group">
                                                    <div class="input-group-addon">
                                                        <i class="fa fa-calendar"></i>
                                                    </div>
                                                    <form:input type="text" class="form-control" data-inputmask="'alias': 'dd/mm/yyyy'"
                                                                path="parent.motherDateOfBirth" data-mask="true"/>
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
                                                                path="parent.contactNumber"/>
                                                </div>
                                                <!-- /.input group -->
                                            </div>
                                            <!-- /.form group -->

                                        </div>
                                        <!-- /.box-body -->
                                    </div>
                                    <!-- /.box -->
                                </div>



                            </div>

                            <div class="chart tab-pane" id="contact-info" style="position: relative;">
                                <br/>

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
                                                            path="email"/>
                                            </div>


                                            <!-- phone mask -->
                                            <div class="form-group">
                                                <label>Phone Number</label>

                                                <div class="input-group">
                                                    <div class="input-group-addon">
                                                        <i class="fa fa-phone"></i>
                                                    </div>
                                                    <form:input type="text" class="form-control"
                                                                data-inputmask='"mask": "(999) 999-9999"'
                                                                data-mask="true" path="mobileNumber"/>
                                                </div>
                                                <!-- /.input group -->
                                            </div>
                                            <!-- /.form group -->

                                            <div class="form-group">
                                                <label>House Number</label>
                                                <form:input type="text" class="form-control"
                                                            placeholder="Enter House Number"
                                                            path="address.homeNumber"/>
                                            </div>


                                            <div class="form-group">
                                                <label>Address Line 1</label>
                                                <form:input type="text" class="form-control"
                                                            placeholder="Enter Address Line 2"
                                                            path="address.addressLineOne"/>
                                            </div>


                                            <div class="form-group">
                                                <label>Address Line 2</label>
                                                <form:input type="text" class="form-control"
                                                            placeholder="Enter Address Line 1"
                                                            path="address.addressLineTwo"/>
                                            </div>


                                            <div class="form-group">
                                                <label>District</label>
                                                <form:input type="text" class="form-control"
                                                            placeholder="Enter District"
                                                            path="address.district"/>
                                            </div>


                                            <div class="form-group">
                                                <label>Province</label>
                                                <form:input type="text" class="form-control"
                                                            placeholder="Enter Province"
                                                            path="address.province"/>
                                            </div>

                                        </div>
                                        <!-- /.box-body -->
                                    </div>
                                    <!-- /.box -->
                                </div>
                            </div>
                            <div class="chart tab-pane" id="enrollment-info" style="position: relative; height: 300px;">

                            </div>
                            <div class="chart tab-pane" id="others" style="position: relative; height: 300px;">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.row -->


            <div class="row">
                <div class="col-md-12">
                    <div class="box box-default">
                        <div class="box-body">
                            <div class="box-footer">
                                <button type="submit" class="btn btn-primary">Submit</button>
                                &nbsp;
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
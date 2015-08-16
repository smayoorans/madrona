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
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Forms</a></li>
            <li class="active">General Elements</li>
        </ol>
    </section>

    <!-- Main content -->
    <section class="content">
        <!-- form start -->
        <form role="form" method="post" action="insert-student">

            <div class="row">
                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div class="box box-primary">
                        <div class="box-header">
                            <h3 class="box-title">Available Students</h3>
                        </div>
                        <!-- /.box-header -->

                        <div class="box-body">
                            <div class='span4'>
                                <ol class='simple_with_animation vertical'>
                                    <c:forEach items="${students}" var="student">
                                        <li><img src="<c:url value="/resources/profiles/${student.profilePicture}"/>"
                                                 class="img-thumbnail img-circle" width="100px">
                                            <span style="padding-left: 30px;font-size: 20px">
                                            <a href="view-student?id=${student.id}"> ${student.studentName}</a>
                                            </span>
                                        </li>
                                    </c:forEach>

                                    <li><img src="<c:url value="/resources/dist/img/user3-128x128.jpg"/>"
                                             class="img-thumbnail img-circle">
                                        <span style="padding-left: 30px;font-size: 20px">Shanya</span>
                                    </li>

                                    <li><img src="<c:url value="/resources/dist/img/user4-128x128.jpg"/>"
                                             class="img-thumbnail img-circle">
                                        <span style="padding-left: 30px;font-size: 20px">Venuja</span>
                                    </li>
                                    <li><img src="<c:url value="/resources/dist/img/user5-128x128.jpg"/>"
                                             class="img-thumbnail img-circle">
                                        <span style="padding-left: 30px;font-size: 20px">Sinthuja</span>
                                    </li>
                                </ol>
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
                            <h3 class="box-title">Assigned Students</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <div class='span4'>
                                <ol class='simple_with_animation vertical'>
                                    <li><img src="<c:url value="/resources/dist/img/user6-128x128.jpg"/>"
                                             class="img-thumbnail img-circle">
                                        <span style="padding-left: 30px;font-size: 20px">Kayooran</span>
                                    </li>
                                    <li><img src="<c:url value="/resources/dist/img/user7-128x128.jpg"/>"
                                             class="img-thumbnail img-circle">
                                        <span style="padding-left: 30px;font-size: 20px">Davee</span>
                                    </li>
                                    <li><img src="<c:url value="/resources/dist/img/user8-128x128.jpg"/>"
                                             class="img-thumbnail img-circle">
                                        <span style="padding-left: 30px;font-size: 20px">Banujan</span>
                                    </li>

                                </ol>
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
        </form>
    </section>
    <!-- /.content -->
</div>
<!-- /.content-wrapper -->
</body>
</html>